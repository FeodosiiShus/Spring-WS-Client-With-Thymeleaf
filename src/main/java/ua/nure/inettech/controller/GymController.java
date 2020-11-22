package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.nure.inettech.entity.Gym;
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

    @GetMapping("find")
    public String findGym(){
        return "find";
    }

    @PostMapping("find")
    public String findGymByName(@RequestParam String name, Model model) throws Throwable {
        model.addAttribute("getGym", gymRepository.findGymByName(name));
        return "find_gym";
    }

    @GetMapping("add")
    public String addGym(){
        return "add_gym";
    }

    @PostMapping("add")
    public String addNewGym(@Validated Integer id, String name, Integer maxUsers, String information, Model model) throws Throwable {
        Gym gym = new Gym();
        gym.setId(id);
        gym.setGymName(name);
        gym.setGymMaximumUser(maxUsers);
        gym.setGymInformation(information);
        model.addAttribute("gyms", gymRepository.addGym(gym));
        return "redirect:/gyms";
    }
}
