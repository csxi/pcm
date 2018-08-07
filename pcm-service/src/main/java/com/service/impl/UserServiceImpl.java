package com.service.impl;

import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import persistent.UserMapper;
import vo.UserVo;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 15:32
 */

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userMapper;
    @Transactional
    public void addUser(UserVo user) throws Exception {
        userMapper.addUser(user);
    }
}
