package webtech.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping(path ="/")
    public ModelAndView showHelloPage() {
        return new ModelAndView("helloworld");
    }

    @GetMapping("/greeting")
    public String greeting (@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}
