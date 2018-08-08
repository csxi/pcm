package service;

import vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/8 11:52
 */
public interface UserService {
  UserVo getUser(String userId);
}
