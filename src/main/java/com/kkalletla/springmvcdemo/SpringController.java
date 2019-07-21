package main.java.com.kkalletla.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*Step 1: Create Controller*/
@Controller
public class SpringController {

    /*Step 2: Define Controller Method
    * Step 3: Add Request mapping to controller method*/
    @RequestMapping("/")
    public String myServletResolver(){
        /*Return view name*/
        return "main-menu";
        /*Step 5: Create the view*/
    }
}
