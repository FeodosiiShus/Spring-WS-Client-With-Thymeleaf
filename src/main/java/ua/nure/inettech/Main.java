package ua.nure.inettech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.nure.inettech.controller.GymController;
import ua.nure.inettech.entity.Gym;
import ua.nure.inettech.repository.GymRepository;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Main.class, args);
    }
}
