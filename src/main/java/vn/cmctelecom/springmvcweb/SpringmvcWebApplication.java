package vn.cmctelecom.springmvcweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringmvcWebApplication {
    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("ccc");
        return "index";
    }
}
