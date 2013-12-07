package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    
    @RequestMapping("/admin")
    public String admin(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "admin";
    }
    
    @RequestMapping(value = "/admin.html", method = RequestMethod.GET)
    public ModelAndView indexView() {
        ModelAndView mv = new ModelAndView("admin");

        String userName = "Admin";

        mv.addObject("username", userName);
        return mv;
    }
}