package com.example.form;


import com.example.form.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.form.UserRepository;

@Controller
public class MyController {


    @GetMapping("/addUser")
    public String sendForm(User user) {

        return "addUser";
    }

//    @PostMapping("/addUser")
//    public String processForm(User user) {
//
//        return "showMessage";
//    }

    @Autowired
    private UserRepository repo;

    @PostMapping("/addUser")
    public String set(User newuser){

        user document = new user(newuser.getName(),newuser.getOccupation());

        repo.save(document);
        System.out.println("Registered .... " + document.getName()+ " as "+ document.getOccupation());
        return "showMessage";

    }
}
