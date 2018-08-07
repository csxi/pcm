package controller;

import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 16:01
 */
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/login")
    public String login(){
        return "hell";
    }
}
