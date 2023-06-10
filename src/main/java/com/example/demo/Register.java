package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {
  
  
  @PostMapping("/register_result")
  public ModelAndView register
    (@ModelAttribute RegisterBean rb, ModelAndView mav) {
    mav.addObject("rb", rb);
    mav.setViewName("register_result.html");
    return mav;
  }
}
