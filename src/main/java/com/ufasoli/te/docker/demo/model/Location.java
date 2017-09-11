package com.ufasoli.te.docker.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Location {

    @Id
    private Long id;

    private String name;

    private String country;
}
