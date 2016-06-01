package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Pet;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/pets")
@Controller
@RooWebScaffold(path = "pets", formBackingObject = Pet.class)
@RooWebFinder
public class PetController {
    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public @ResponseBody
    String foo() {
        return "foo";
    }
}
