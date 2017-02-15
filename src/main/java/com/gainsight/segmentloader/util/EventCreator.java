package com.gainsight.segmentloader.util;

import com.gainsight.segmentloader.pojo.*;

/**
 * Created by samujjal on 16/02/17.
 */
public class EventCreator {
    //TODO: list of events, properties and traits to pick randomly from
    public Track constructTrackEvent(String userId){
        Track track = new Track();
        track.setEvent("Course Clicked");
        track.setUserId(userId);
        Properties properties = new Properties();
        properties.setAdditionalProperty("title", "Intro to Analytics");
        properties.setAdditionalProperty("price", 87.66);
        properties.setAdditionalProperty("shipping", "5-day");
        track.setProperties(properties);
        return track;
    }

    public Identify constructIdentifyEvent(String userId){
        Identify identify = new Identify();
        identify.setUserId(userId);
        Traits traits = new Traits();
        traits.setEmail("smajumder@gainsight.com");
        traits.setName("Samujjal Majumder");
        identify.setTraits(traits);
        return identify;
    }

    public Group constructGroupEvent(String groupId, String userId){
        Group group = new Group();
        group.setGroupId(groupId);
        group.setUserId(userId);
        Traits traits = new Traits();
        traits.setName("Segment");
        traits.setSize(700);
        group.setTraits(traits);
        return group;
    }
}
