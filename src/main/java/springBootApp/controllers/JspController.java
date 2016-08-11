package springBootApp.controllers; //  original content //


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Letricia on 8/8/16.
 */
@Controller
public class JspController {                                    //  original content //

    @RequestMapping(value="/")                                  //  original content //
    public String jspIndex() {
        return "index";
    }               //  original content //

    @RequestMapping(value="/jspTest")                           //  original content //
    public String jspTest() {
        return "test";
    }
    //  original content //

    @RequestMapping(value = "/jspUserInterface")
    public String jspUserInterface(){
        return "userInterface";

    }

}



