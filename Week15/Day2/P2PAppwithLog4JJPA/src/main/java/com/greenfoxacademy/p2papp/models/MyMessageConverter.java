package com.greenfoxacademy.p2papp.models;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.Strings;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class MyMessageConverter implements AttributeConverter<Message, String> {

    private static final StatusLogger LOGGER = StatusLogger.getLogger();

    @Override
    public String convertToDatabaseColumn(final org.apache.logging.log4j.message.Message message) {
        if (message == null) {
            return null;
        }

        return message.getFormattedMessage();
    }

    @Override
    public org.apache.logging.log4j.message.Message convertToEntityAttribute(final String s) {
        if (Strings.isEmpty(s)) {
            return null;
        }

        return LOGGER.getMessageFactory().newMessage(s);
    }
}
