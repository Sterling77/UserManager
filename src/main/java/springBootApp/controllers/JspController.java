package springBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Letricia on 8/8/16.
 */
@Controller
public class JspController {

    @RequestMapping(value="/")
    public String jspIndex() {
        return "index";
    }

    @RequestMapping(value="/jspTest")
    public String jspTest() {
        return "test";
    }
//    @RequestMapping(value="/getSentence")
//    public String getSentence(String s,ModelMap map) {
//        char [] c= s.toCharArray();
//        int countChars = c.length;
//        map.addAttribute("countChars", countChars);
//        return "test";
//    } test 
}
