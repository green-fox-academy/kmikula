package com.greenfoxacademy.listingtodos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ToDo {
    @Id
    @GeneratedValue
    Long id;
    String title;
    Boolean urgent;
    Boolean done;

    public ToDo( String title, boolean b, boolean b1) {

        this.title=title;
        this.urgent=b;
        this.done=b1;
    }
}
