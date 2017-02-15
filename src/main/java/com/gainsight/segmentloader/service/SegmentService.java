package com.gainsight.segmentloader.service;

import com.gainsight.segmentloader.pojo.Group;
import com.gainsight.segmentloader.pojo.Identify;
import com.gainsight.segmentloader.pojo.Track;
import com.gainsight.segmentloader.util.Constants;
import com.gainsight.segmentloader.util.SegmentLog;
import com.google.common.collect.ImmutableMap;
import com.segment.analytics.Analytics;
import com.segment.analytics.messages.GroupMessage;
import com.segment.analytics.messages.IdentifyMessage;
import com.segment.analytics.messages.TrackMessage;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by samujjal on 15/02/17.
 */
public class SegmentService {
    private final String WRITE_KEY = Constants.properties.getProperty("segment.writekey");
    private final Analytics analytics = Analytics.builder(WRITE_KEY)
            //            .log(SegmentLog.STDOUT)
            .callback(SegmentLog.CALLBACK)
            .build();

    public void sendIdentifyMessage(Identify identify){
        ImmutableMap<String, Object> objectImmutableMap
                = ImmutableMap.<String, Object>builder()
                .put("name", "Donald J Trump")
                .put("email", "donald@trump.com")
                .build();
        analytics.enqueue(IdentifyMessage.builder()
                .userId("xfdfs343dd").timestamp(Date.from(Instant.now()))
                .traits(objectImmutableMap));
    }

    public void sendTrackEvent(Track track){
        //        Track track = new Track();
//        track.setEvent("Item Purchased");
//        ObjectMapper mapper = new ObjectMapper();
//        track.setUserId("f4ca124298");
//        track.setTimestamp(Date.from(Instant.EPOCH));
//        Properties properties = new Properties();
//        properties.setAdditionalProperty("revenue", 393.5);
//        properties.setAdditionalProperty("shipping", "2-day");
//        track.setProperties(properties);
//        Map<String, Object> map = mapper.convertValue(properties, Map.class);
        analytics.enqueue(TrackMessage.builder("Item Deported")
                .userId("xfdfs343dd").timestamp(Date.from(Instant.now()))
                .properties(ImmutableMap.<String, Object>builder()
                        .put("revenue", 99.95)
                        .put("shipping", "1-day")
                        .build()
                )
        );
    }

    public void sendGroupMessage(Group group){
        analytics.enqueue(GroupMessage.builder("KKK")
                .userId("xfdfs343dd").timestamp(Date.from(Instant.now()))
                .traits(ImmutableMap.<String, Object>builder()
                        .put("name", "Segment")
                        .put("size", 43)
                        .build()
                )
        );
    }

    public void cleanPipe(){
        analytics.flush();
    }

    public void closePipe() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(30));
        analytics.shutdown();
    }
}
