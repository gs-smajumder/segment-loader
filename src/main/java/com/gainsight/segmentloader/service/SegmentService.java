package com.gainsight.segmentloader.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gainsight.segmentloader.pojo.Group;
import com.gainsight.segmentloader.pojo.Identify;
import com.gainsight.segmentloader.pojo.Track;
import com.gainsight.segmentloader.util.Constants;
import com.gainsight.segmentloader.util.SegmentLog;
import com.segment.analytics.Analytics;
import com.segment.analytics.messages.GroupMessage;
import com.segment.analytics.messages.IdentifyMessage;
import com.segment.analytics.messages.TrackMessage;

import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by samujjal on 15/02/17.
 */
public class SegmentService {
    private final int SLEEP_MINUTES = Integer.parseInt(Constants.properties.getProperty("thread.minutes.sleep"));
    private final String WRITE_KEY = Constants.properties.getProperty("segment.writekey");
    private final Analytics analytics = Analytics.builder(WRITE_KEY)
            //            .log(SegmentLog.STDOUT)
            .callback(SegmentLog.CALLBACK)
            .build();

    public void sendIdentifyMessage(Identify identify){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> traitsMap = mapper.convertValue(identify.getTraits(), Map.class);
        analytics.enqueue(IdentifyMessage.builder()
                .userId(identify.getUserId()).timestamp(Date.from(Instant.now()))
                .traits(traitsMap));
    }

    public void sendTrackEvent(Track track){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> properties = mapper.convertValue(track.getProperties(), Map.class);
        analytics.enqueue(TrackMessage.builder(track.getEvent())
                .userId(track.getUserId()).timestamp(Date.from(Instant.now()))
                .properties(properties)
        );
    }

    public void sendGroupMessage(Group group){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> traitsMap = mapper.convertValue(group.getTraits(), Map.class);
        analytics.enqueue(GroupMessage.builder(group.getGroupId())
                .userId(group.getUserId()).timestamp(Date.from(Instant.now()))
                .traits(traitsMap)
        );
    }

    public void cleanPipe(){
        analytics.flush();
    }

    public void closePipe() throws InterruptedException {
        Thread.sleep(TimeUnit.MINUTES.toMillis(10));
        analytics.shutdown();
    }
}
