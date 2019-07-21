package main.java.com.kkalletla.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {


    /*Controller method to show the initial form*/
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld-main";
    }

    /*Controller method to process the form*/
    @RequestMapping("processForm")
    public String processForm(){
        return "helloworld";
    }

    /*
    The following statement is used to get the HttpServletRequest object and retrieve parameters from it.
    This can be used if there are large number of parameters.*/
    @RequestMapping("processFormV2")
    public String processFormV2(HttpServletRequest request, Model model){
        String name = request.getParameter("eName");
        name = name.toUpperCase();
        model.addAttribute("message", name);
        return "helloworld";
    }


    /*The following statement is used to get each parameter in individual objects or entities*/
    @RequestMapping("processFormV3")
    public String processFormV3(@RequestParam("eName") String name, Model model){
        name = name.toUpperCase();
        model.addAttribute("message", name);
        return "helloworld";
    }
}
