package com.codegym.controller;

import com.codegym.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/product", ""})
public class ProductController {

    @GetMapping(value = "")
    public String goList() {
		// test 1
        return "list_products";
    }

    @GetMapping(value = "/login")
    public String goLogin(Model model) {
        model.addAttribute("userDto", new UserDto());

        return "go_login";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute @Validated UserDto userDto,
                        BindingResult bindingResult,
                        Model model) {

        if (bindingResult.hasErrors()) {
            return "go_login";
        }

        model.addAttribute("msg", "Login success!");

        return "go_login";
    }
}
