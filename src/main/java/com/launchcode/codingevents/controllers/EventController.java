package com.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String displayEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Joe Mama Festival");
        events.add("Gay Month");
        events.add("Yeah");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String createEventForm() {
        return "events/create";
    }
}
