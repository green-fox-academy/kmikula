package com.greenfoxacademy.p2papp.models;

/*@Converter(autoApply = false)
public abstract class MyMessageConverter implements AttributeConverter<org.apache.logging.log4j.message.Message, String> {

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
}   */
