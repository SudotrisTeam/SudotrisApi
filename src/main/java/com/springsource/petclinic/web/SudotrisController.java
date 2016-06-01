package com.springsource.petclinic.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/sudotris")
@Controller
public class SudotrisController {
    @RequestMapping(value = "/fooo", method = RequestMethod.GET)
    public @ResponseBody
    String fooo() {
        return "fooo";
    }
}
