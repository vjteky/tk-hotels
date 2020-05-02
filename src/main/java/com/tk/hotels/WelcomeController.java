package com.tk.hotels;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
    public String welcome(Model model) {
        

        return "index"; //view
    }
	
	@GetMapping("/index.html")
    public String index(Model model) {
        

        return "index"; //view
    }

}
