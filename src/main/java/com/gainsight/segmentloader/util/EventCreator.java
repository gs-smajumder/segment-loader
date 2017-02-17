package com.gainsight.segmentloader.util;

import com.gainsight.segmentloader.pojo.*;

import java.util.Map;

/**
 * Created by samujjal on 16/02/17.
 */
public class EventCreator {
    //TODO: list of events, properties and traits to pick randomly from
    static String[] trackEventNames = Constants.properties.getProperty("track.eventname").split(",");
    static String[] traitPlans = Constants.properties.getProperty("traits.plan").split(",");
    static String[] traitIndustry = Constants.properties.getProperty("traits.industry").split(",");
    static String[] addressCountry = Constants.properties.getProperty("address.country").split(",");
    static String[] addressState = Constants.properties.getProperty("address.state").split(",");
    static String[] addressCity = Constants.properties.getProperty("address.city").split(",");

    public Track constructTrackEvent(String userId){
        Track track = new Track();
        track.setEvent(trackEventNames[(int)(Math.random() * trackEventNames.length)]);
        track.setUserId(userId);
        Properties properties = new Properties();
        properties.setAdditionalProperty("title", RandomStringGenerator.randomUserName(5));
        properties.setAdditionalProperty("price", Math.random() * 99);
        properties.setAdditionalProperty("shipping", (1 + (int)(Math.random() * 10)) + "-day");
        track.setProperties(properties);
        return track;
    }

    public Identify constructIdentifyEvent(String userId){
        Identify identify = new Identify();
        identify.setUserId(userId);
        Traits traits = new Traits();
        traits.setEmail(userId+"@gainsight.com");
        traits.setName(RandomStringGenerator.randomUserName(8));
        traits.setPlan(traitPlans[(int)(Math.random() * traitPlans.length)]);
        traits.setLogins((int)(Math.random()*20));
        Address address = new Address();
        address.setCountry(addressCountry[(int)(Math.random() * addressCountry.length)].trim());
        address.setCity(addressCity[(int)(Math.random() * addressCity.length)].trim());
        address.setState(addressState[(int)(Math.random() * addressState.length)].trim());
        address.setStreet((int)(Math.random() * 15) + " Street");
        address.setPostalCode(RandomStringGenerator.randomNumberSequence(6));
        traits.setAddress(address);
        identify.setTraits(traits);
        return identify;
    }

    public Group constructGroupEvent(String groupId, String userId){
        Group group = new Group();
        group.setGroupId(groupId);
        group.setUserId(userId);
        Traits traits = new Traits();
        traits.setName("Segment");
        traits.setSize((int)(Math.random() * 50));
        traits.setPlan(traitPlans[(int)(Math.random() * traitPlans.length)]);
        traits.setAdditionalProperty("industry", traitIndustry[(int)(Math.random() * traitIndustry.length)]);
        traits.setAdditionalProperty("employees", (int)(Math.random() * 155));
        traits.setAdditionalProperty("phone", RandomStringGenerator.randomNumberSequence(10));
        Address address = new Address();
        address.setCountry(addressCountry[(int)(Math.random() * addressCountry.length)].trim());
        address.setCity(addressCity[(int)(Math.random() * addressCity.length)].trim());
        address.setState(addressState[(int)(Math.random() * addressState.length)].trim());
        address.setStreet((int)(Math.random() * 15) + " Street");
        address.setPostalCode(RandomStringGenerator.randomNumberSequence(6));
        traits.setAddress(address);
        group.setTraits(traits);
        return group;
    }
}
