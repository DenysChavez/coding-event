package org.launchcode.codingevent.controllers;
import org.launchcode.codingevent.data.EventData;
import org.launchcode.codingevent.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, @RequestParam String descriptionEvent) {
        EventData.add(new Event(eventName, descriptionEvent));
        return "redirect:";
    }


}
