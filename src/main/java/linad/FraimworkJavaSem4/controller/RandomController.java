package linad.FraimworkJavaSem4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.Random;

@Controller
public class RandomController {
    private double num;
    @GetMapping("/random")
    public String getRandom(Model model){
        int min = 0;
        int max = 100;
        num = (int) ((Math.random()+(max-min))+(min));
        model.addAttribute("num", num);
        model.addAttribute("min", min);
        model.addAttribute("max", max);

        return "random";
    }
    @GetMapping("/random/{min}/{max}")
    public String getMinMaxRandom(@PathVariable(name = "min") double min, @PathVariable(name = "max") double max, Model model){
        num = (int) ((Math.random()*(max-min))+(min));
        model.addAttribute("num", num);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "random";
    }
}
