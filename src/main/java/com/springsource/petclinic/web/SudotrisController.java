package com.springsource.petclinic.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/sudotris")
@Controller
public class SudotrisController {
    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public @ResponseBody
    String fooo() {
        return "fooo";
    }

    @RequestMapping(value = "/fooo/{id}/plusUn", method = RequestMethod.GET)
    public @ResponseBody int plusUn(@PathVariable("id") int id) {
        return id + 1;
    }

    @RequestMapping(value = "/fooo/{id}/plus", method = RequestMethod.GET)
    public int plus(@PathVariable("id") int id) {
        return id + 1;
    }

    @RequestMapping(value = "/foo/{id}/plusUn", method = RequestMethod.GET)
    public @ResponseBody Integer plusUn(@PathVariable("id") Integer id) {
        return id + 1;
    }

    @RequestMapping(value = "/foo/{id}/plus", method = RequestMethod.GET)
    public Integer plus(@PathVariable("id") Integer id) {
        return id + 1;
    }

    @RequestMapping(value = "/id/{id}", method=RequestMethod.GET)
    public int getOrder(@PathVariable int id){
        return id;
    }
}
