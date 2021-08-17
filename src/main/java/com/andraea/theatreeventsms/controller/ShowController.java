package com.andraea.theatreeventsms.controller;

import com.andraea.theatreeventsms.model.Show;
import com.andraea.theatreeventsms.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    // display list of show
    @GetMapping("/TheatreEvents")
    public String viewHomePage(Model model) {
        model.addAttribute("showList", showRepository.findAll());
        return "index";
    }
    @GetMapping("/selectShow/{id}")
    public String viewShowDetails(Model model, @PathVariable Long id) {
        model.addAttribute("show", showRepository.findById(id).get());
        return "showDetails";
    }
    //@PostMapping(//specify @)
}
