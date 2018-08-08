package com.pcm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pcm.service.UserService;
import com.pcm.vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 16:01
 */
@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserService userService;
  public UserVo getUser(String userId){
    return
    userService.getUser(userId);
  }
}
