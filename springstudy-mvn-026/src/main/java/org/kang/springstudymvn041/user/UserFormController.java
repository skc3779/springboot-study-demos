package org.kang.springstudymvn041.user;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserFormController {
    @GetMapping("/user/new")
    public String newUserForm() {
        return "user/new";
    }

    @PostMapping("/user/new")
    public String newUserHandler(@ModelAttribute @Valid User user, BindingResult result) {
        if(result.hasErrors()) {
            return "user/new";
        }
        return "redirect:/user";
    }
}
