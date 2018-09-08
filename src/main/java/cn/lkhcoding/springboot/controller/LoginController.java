package cn.lkhcoding.springboot.controller;


import cn.lkhcoding.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        Model model) {

       int i = userService.getUser(username, password);
       if(i == 1){
           model.addAttribute("username",username);
           return "success";
       }
        return "error";
    }

}
