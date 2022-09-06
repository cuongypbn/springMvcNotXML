package vn.cmctelecom.springmvcweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Controller
public class SpringmvcWebApplication  extends SpringBeanAutowiringSupport {

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("ccc");
        return "index";
    }
}
