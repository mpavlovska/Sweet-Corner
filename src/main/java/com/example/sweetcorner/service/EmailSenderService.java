package com.example.sweetcorner.service;

public interface EmailSenderService {

    void sendEmail(String to, String subject, String message);

}
