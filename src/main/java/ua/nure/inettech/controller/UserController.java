package ua.nure.inettech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.inettech.entity.*;
import ua.nure.inettech.repository.UserRepository;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

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

    @GetMapping("addUser")
    public String addUser(){ return "add_user";}

    @PostMapping("addUser")
    public String addNewUser(@Validated Integer userId, String userName, String userLastName, String userInformation, String userBirthday, String userPhone,
                             Integer orderId, String orderStatus, String orderStart, String orderEnd,
                             Integer subsId, String subsName, Double subsPrice, Integer subsVisit,
                             Integer gymId, String gymName, Integer gymMaxUser, String gymInformation,
                             Integer trainerId, String trainerName, String trainerLastName, Integer trainerExperience, String trainerInformation, String trainerPhone, Model model) throws Throwable{
        User newUser = new User();
        newUser.setId(userId);
        newUser.setUserName(userName);
        newUser.setUserLastName(userLastName);
        newUser.setUserInformation(userInformation);
        newUser.setUserBirthdayDate(userBirthday);

        Order newOrder = new Order();
        newOrder.setId(orderId);
        newOrder.setOrderStartDateSubscription(orderStart);
        newOrder.setOrderEndDateSubscription(orderEnd);

        Subscription sub = new Subscription();
        sub.setId(subsId);
        sub.setSubscriptionName(subsName);
        sub.setSubscriptionPrice(subsPrice);
        sub.setSubscriptionCountVisits(subsVisit);

        Gym g = new Gym();
        g.setId(gymId);
        g.setGymName(gymName);
        g.setGymMaximumUser(gymMaxUser);
        g.setGymInformation(gymInformation);

        Trainer trainer = new Trainer();
        trainer.setId(trainerId);
        trainer.setTrainerName(trainerName);
        trainer.setTrainerLastName(trainerLastName);
        trainer.setTrainerExperienceYear(trainerExperience);
        trainer.setTrainerInformation(trainerInformation);
        model.addAttribute("user", userRepository.addUser(newUser, userPhone, newOrder, orderStatus, sub, g, trainer, trainerPhone));
        return "redirect:/users";
    }
}
