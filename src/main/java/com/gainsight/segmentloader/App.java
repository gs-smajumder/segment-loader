package com.gainsight.segmentloader;

import com.gainsight.segmentloader.pojo.Group;
import com.gainsight.segmentloader.pojo.Identify;
import com.gainsight.segmentloader.pojo.Track;
import com.gainsight.segmentloader.service.SegmentService;
import com.gainsight.segmentloader.util.Constants;
import com.gainsight.segmentloader.util.EventCreator;
import com.gainsight.segmentloader.util.RandomStringGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Application Entry
 */
public class App {
    static Logger LOGGER = LoggerFactory.getLogger(App.class);
    private static final int GROUPCOUNT = Integer.parseInt(Constants.properties.getProperty("segment.groupcount"));
    private static final int USERCOUNT = Integer.parseInt(Constants.properties.getProperty("segment.usercount"));
    private static final int TRACKCOUNT = Integer.parseInt(Constants.properties.getProperty("segment.trackcount"));

    public static void main(String[] args) throws InterruptedException {
        SegmentService segmentService = new SegmentService();
        EventCreator eventCreator = new EventCreator();

        for (int i = 0; i < GROUPCOUNT; i++) {
            String groupId = "Group-" + i;
            for (int userCount = 0; userCount < USERCOUNT; userCount++) {
                String userId = RandomStringGenerator.randomUserId(10);
                Group groupEvent = eventCreator.constructGroupEvent(groupId, userId);
                Identify identifyEvent = eventCreator.constructIdentifyEvent(userId);
                segmentService.sendIdentifyMessage(identifyEvent);
                segmentService.sendGroupMessage(groupEvent);
                for (int trackCount = 0; trackCount < TRACKCOUNT; trackCount++) {
                    Track trackEvent = eventCreator.constructTrackEvent(userId);
                    segmentService.sendTrackEvent(trackEvent);
                }
            }
        }

        segmentService.cleanPipe();
        segmentService.closePipe();
        System.exit(0);
    }


}
