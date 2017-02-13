package sample.customer.web.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.customer.web.form.TestForm;


@Controller
public class TestController {


    @RequestMapping(value = "/", method = GET)
    public String home(TestForm testForm, Model model) {
        return "test";
    }
    @RequestMapping(value = "/test", method = POST)
    public String test(@Valid TestForm testForm, Model model) {
        return "test";
    }

    
}
