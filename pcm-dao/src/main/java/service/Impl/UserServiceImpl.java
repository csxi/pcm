package service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistent.UserMapper;
import service.UserService;
import vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/8 11:53
 */
@Service("userService")
public class UserServiceImpl implements UserService{
@Autowired
  UserMapper userMapper;
  public UserVo getUser(String userId) {
    return userMapper.getUser(userId);
  }
}
