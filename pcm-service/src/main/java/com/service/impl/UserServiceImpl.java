package com.service.impl;

import org.springframework.stereotype.Service;
import vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 15:32
 */
@Service
public class UserServiceImpl {
/*
    @Autowired
    private UserMapper userMapper;*/

    @Override
    public void addUser(UserVO user) throws Exception{
        userDao.addUser(user);
    }

}
