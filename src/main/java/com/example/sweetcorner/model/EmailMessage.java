package com.example.sweetcorner.model;

import lombok.Data;

@Data
public class EmailMessage {

    private String to;
    private String subject;
    private String message;

    public EmailMessage() {
    }

//    public EmailMessage(String to, String subject, String message) {
//        this.to = to;
//        this.subject = subject;
//        this.message = message;
//    }

    public EmailMessage(String to) {
        this.to = to;
        this.subject = "";
        this.message = "";
    }
}
