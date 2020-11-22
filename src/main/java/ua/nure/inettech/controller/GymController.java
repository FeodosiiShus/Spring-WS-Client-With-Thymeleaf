package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.inettech.repository.GymRepository;



@Controller
@RequestMapping(path = "/")
public class GymController {

    @Autowired
    GymRepository gymRepository;

    @GetMapping("gyms")
    public String getAllGyms(Model model) throws Throwable {
      model.addAttribute("gyms", gymRepository.AllGyms());
      return "gym";
    }
}
