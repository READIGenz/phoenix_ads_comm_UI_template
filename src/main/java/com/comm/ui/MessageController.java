package com.comm.ui;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MessageController {
    public MessageController() {
    }

    @GetMapping({"/getMessage"})
    public String getMessage() {
        return "Report is processing...Please wait!!";
    }
}
