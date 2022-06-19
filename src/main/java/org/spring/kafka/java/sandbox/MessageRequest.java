package org.spring.kafka.java.sandbox;

public class MessageRequest {
    private String message;

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return String.format("MessageRequest(message=%s)", message);
    }
}
