package com.contorller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;

@Controller
@RequestMapping("/user")
public class userController {
  @Resource
  private com.service.userService userService;
 
  @RequestMapping("/showUser")
  public String toIndex(HttpServletRequest request,Model model){
    int userId = Integer.parseInt(request.getParameter("id"));
    User user = this.userService.findUser(userId);
    model.addAttribute("user", user);
    return "showUser";
  }
}
