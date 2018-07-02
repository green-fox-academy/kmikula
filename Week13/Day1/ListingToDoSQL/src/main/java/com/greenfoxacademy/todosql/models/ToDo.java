package com.greenfoxacademy.todosql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todoId")
    Long id;
    String title;
    Boolean urgent;
    Boolean done;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "assignee_Id")
    private Assignee assignee;

    public ToDo() {
//        ArrayList<Assignee> assignees = new ArrayList<>();

    }

    public ToDo(String title) {
//        ArrayList<Assignee> assignees = new ArrayList<>();
        this.title = title;
        this.urgent = true;
        this.done = false;
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

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

//    public ArrayList<Assignee> getAssignees() {
//        return assignees;
//    }
//
//    public void setAssignees(ArrayList<Assignee> assignees) {
//        this.assignees = assignees;
//    }

}
