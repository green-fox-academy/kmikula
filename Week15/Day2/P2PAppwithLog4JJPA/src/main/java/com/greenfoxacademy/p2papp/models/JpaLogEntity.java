package com.greenfoxacademy.p2papp.models;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.db.jpa.BasicLogEventEntity;
import org.apache.logging.log4j.message.Message;

import javax.persistence.*;

@Entity
@Table(name="application_log", schema="dbo")
public class JpaLogEntity extends BasicLogEventEntity {

    private static final long serialVersionUID = 1L;
    private long id = 0L;

//    public TestEntity() {
//        super(null);
//    }
//    public TestEntity(LogEvent wrappedEvent) {
//        super(wrappedEvent);
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    @Enumerated(EnumType.STRING)
    @Column(name = "level")
    public Level getLevel() {
        return this.getWrappedEvent().getLevel();
    }

    @Override
    @Column(name = "logger")
    public String getLoggerName() {
        return this.getWrappedEvent().getLoggerName();
    }

    @Override
    @Column(name = "message")
    @Convert(converter = MyMessageConverter.class)
    public Message getMessage() {
        return this.getWrappedEvent().getMessage();
    }

//    private static final long serialVersionUID = 1L;
//    private long id = 0L;
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "logEventId")
//    public long getId() {
//        return this.id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Override
//    public String getLoggerFqcn() {
//        return null;
//    }
//
//    @Override
//    @Enumerated(EnumType.STRING)
//    @Column(name = "level")
//    public Level getLevel() {
//        return this.getWrappedEvent().getLevel();
//    }
//
//    @Override
//    @Column(name = "logger")
//    public String getLoggerName() {
//        return this.getWrappedEvent().getLoggerName();
//    }
//
//    @Override
//    @Column(name = "message")
//    @Convert(converter = MyMessageConverter.class)
//    public Message getMessage() {
//        return this.getWrappedEvent().getMessage();
//    }
}

//https://logging.apache.org/log4j/2.x/manual/appenders.html
//https://github.com/apache/logging-log4j2/blob/master/log4j-jpa/src/main/java/org/apache/logging/log4j/jpa/appender/AbstractLogEventWrapperEntity.java