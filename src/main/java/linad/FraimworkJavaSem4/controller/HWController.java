package linad.FraimworkJavaSem4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class HWController {
    @GetMapping("/homework")
    public String getHWList(Model model){
        return "HW";
    }
    @GetMapping("/successLogPass")
    public String getLoginPassword(Model model, @RequestParam(name = "login") String login, @RequestParam(name = "password") String password){
        model.addAttribute("login", login);
        model.addAttribute("password", password);
        return "successLogPass";

    }
}
