package controller;

import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 16:01
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/login")
    public String login(){
        UserVo user = new UserVo();
        user.setUserId("1");
        user.setUserName("us");
        user.setPassword("1");
        try {
            iUserService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "login";
    }
}
