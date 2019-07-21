package main.java.com.kkalletla.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

    /*Controller method to show the initial form*/
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld-main";
    }
}
