package com.greenfoxacademy.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;

    private Timestamp timestamp;
    private Integer score;


    public Post() {

        Instant instant = Instant.now();
        this.timestamp = java.sql.Timestamp.from(instant);

    }

    public Post(String title, String url, Integer score) {
        this.title = title;
        this.url = url;
        //      this.timestamp = LocalDateTime.now();
        Instant instant = Instant.now();
        this.timestamp = java.sql.Timestamp.from(instant);
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public long getTimestamp() {
        return timestamp.getTime();
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
