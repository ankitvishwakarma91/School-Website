package com.example.Ankit.controller;

import com.example.Ankit.Model.Contact;
import com.example.Ankit.Service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ContactController {

//    private static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

//    @PostMapping(value = "/saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String email , @RequestParam String mobileNum
//                                        ,@RequestParam String subject, @RequestParam String message){
//
//        log.info("Name : " + name);
//        log.info("Email : " + email);
//        log.info("MobileNum : " + mobileNum);
//        log.info("Subject : " + subject);
//        log.info("Message : " + message);
//
//
//        return new ModelAndView("redirect:/contact");
//    }

    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetail(contact);
        return new ModelAndView("redirect:/contact");
    }


}
