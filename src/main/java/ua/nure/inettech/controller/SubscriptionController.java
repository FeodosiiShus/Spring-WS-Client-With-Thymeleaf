package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.inettech.entity.Gyms;
import ua.nure.inettech.repository.SubscriptionRepository;

@Controller
@RequestMapping(path = "/")
public class SubscriptionController {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @GetMapping("subscriptions")
    public String getAllSubscriptions(Model model) throws Throwable{
        model.addAttribute("subscriptions", subscriptionRepository.allSubscriptions());
        return "subscription";
    }
}
