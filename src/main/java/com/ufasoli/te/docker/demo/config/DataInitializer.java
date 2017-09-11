package com.ufasoli.te.docker.demo.config;

import com.ufasoli.te.docker.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public DataInitializer(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initData(){

        mongoTemplate.dropCollection(Location.class);

        mongoTemplate.insertAll(Arrays.asList(
                new Location(1L, "Bern", "Switzerland"),
                new Location(2L, "Berlin", "Germany"),
                new Location(3L, "Paris", "France"),
                new Location(4L, "Rome", "Italy"),
                new Location(5L, "Madrid", "Spain"),
                new Location(6L, "Athens", "Greece"),
                new Location(7L, "Copenhagen", "Denmark"),
                new Location(8L, "Dublin", "Ireland"),
                new Location(9L, "London", "United Kingdom"),
                new Location(10L, "Stockholm", "Sweeden"),
                new Location(11L, "Lisbon", "Portugal"),
                new Location(12L, "Amsterdam", "Netherlands"),
                new Location(13L, "Oslo", "Norway"),
                new Location(14L, "Valletta", "Malta"),
                new Location(15L, "Warsaw", "Poland"),
                new Location(16L, "Bucharest", "Romania"),
                new Location(17L, "Budapest", "Hungary"),
                new Location(18L, "Prague", "Czech Republic")
        ));
    }
}
