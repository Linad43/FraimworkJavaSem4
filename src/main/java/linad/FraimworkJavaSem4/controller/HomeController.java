package linad.FraimworkJavaSem4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home/{color}")
    public String getHome(Model model, @PathVariable(name = "color") String color){
        model.addAttribute("color", color);
        model.addAttribute("massage", "My color is ");
        return "home";
    }

}
