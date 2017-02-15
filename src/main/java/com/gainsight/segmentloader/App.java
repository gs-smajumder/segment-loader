package com.gainsight.segmentloader;

import com.gainsight.segmentloader.pojo.Group;
import com.gainsight.segmentloader.pojo.Identify;
import com.gainsight.segmentloader.pojo.Properties;
import com.gainsight.segmentloader.pojo.Track;
import com.gainsight.segmentloader.service.SegmentService;
import com.gainsight.segmentloader.util.EventCreator;
import com.gainsight.segmentloader.util.UserIdGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Application Entry
 */
public class App {
    static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        SegmentService segmentService = new SegmentService();
        EventCreator eventCreator = new EventCreator();
        //TODO: run in loop
        String userId = UserIdGenerator.randomUserId();

        Identify identifyEvent = eventCreator.constructIdentifyEvent(userId);
        Track trackEvent = eventCreator.constructTrackEvent(userId);
        Group groupEvent = eventCreator.constructGroupEvent("007-Dev", userId);

        segmentService.sendIdentifyMessage(identifyEvent);
        segmentService.sendGroupMessage(groupEvent);
        segmentService.sendTrackEvent(trackEvent);

        segmentService.cleanPipe();
        segmentService.closePipe();
        System.exit(0);
    }


}
