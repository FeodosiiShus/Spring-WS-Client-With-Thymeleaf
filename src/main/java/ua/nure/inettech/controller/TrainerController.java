package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.inettech.repository.TrainerRepository;

@Controller
@RequestMapping(path = "/")
public class TrainerController {

    @Autowired
    TrainerRepository trainerRepository;

    @GetMapping("trainers")
    public String getAllTrainers(Model model) throws Throwable {
        model.addAttribute("trainers", trainerRepository.allTrainers());
        return "trainer";
    }
}
