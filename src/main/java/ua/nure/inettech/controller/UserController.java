package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.inettech.repository.UserRepository;

@Controller
@RequestMapping(path = "/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("users")
    public String getAllUsers(Model model) throws Throwable{
        model.addAttribute("users", userRepository.allUsers());
        return "user";
    }
}
