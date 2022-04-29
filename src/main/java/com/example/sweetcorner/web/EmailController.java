package com.example.sweetcorner.web;

import com.example.sweetcorner.model.EmailMessage;
import com.example.sweetcorner.service.EmailSenderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/send-email")
public class EmailController {

    private final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @GetMapping
    public String getSendEmailPage(Model model) {
        model.addAttribute("bodyContent", "send-email");
        return "master-template";
    }

    @PostMapping
    public void sendEmail(EmailMessage emailMessage) {
        emailMessage.setSubject("Your Sweet Corner order is now complete");
        emailMessage.setMessage("THANK YOU FOR YOUR SWEET CORNER PURCHASE. \n YOUR ORDER HAS BEEN SHIPPED.\n");
        this.emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
    }

}
