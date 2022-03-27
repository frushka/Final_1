package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("ok")
public class Controller {
    @PostMapping
    public MessageResp create(@RequestBody MessageReq messageReq) {
        MessageResp messageResp = new MessageResp();
        messageResp.setUser_id(messageReq.getUser_id());
        messageResp.setFirst_text(messageReq.getFirst_text());
        messageResp.setSecond_text(messageReq.getSecond_text());
        messageResp.setThird_text(messageReq.getThird_text());
        return messageResp;
    }
}
