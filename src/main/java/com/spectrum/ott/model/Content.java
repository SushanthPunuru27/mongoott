package com.spectrum.ott.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName="contents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    @Id
    private String id;
    private String title;
    private String genre;
    private String description;
}
