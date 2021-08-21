package com.andraea.theatreeventsms.controller;

import com.andraea.theatreeventsms.model.Show;
import com.andraea.theatreeventsms.repository.ShowRepository;
import com.andraea.theatreeventsms.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private ShowService showService;

    @GetMapping("/TheatreEvents")
    public String viewHomePage(Model model) {
        model.addAttribute("showList", showRepository.findAll());
        return "index";
    }

    @GetMapping("/selectShow/{id}")
    public String viewShowDetails(Model model, @PathVariable Long id) {
        model.addAttribute("show", showService.getShowsById(id));
        return "showDetails";
    }

    @GetMapping("/requestShow")
    public String loadRequestShow(Model model) {
        model.addAttribute("show", new Show());
        return "requestShow";
    }

    @PostMapping("/requestShow")
    public String showSubmit(Model model, @ModelAttribute Show show) {
        showService.saveOrUpdate(show);
        model.addAttribute("showList", showRepository.findAll());
        return "index";
    }
}
