package com.andraea.theatreeventsms.controller;

import com.andraea.theatreeventsms.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    // display list of show
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("showList", showRepository.findAll());
        return "index";
    }
}
