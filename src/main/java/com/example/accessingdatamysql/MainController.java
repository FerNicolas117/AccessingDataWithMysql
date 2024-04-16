package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                            @RequestParam String email,
                                            @RequestParam String occupation) {

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        n.setOccupation(occupation);
        userRepository.save(n);
        return "=== Saved ===";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        System.out.println("=== Get ===");
        return userRepository.findAll();
    }
}
