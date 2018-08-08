package com.pcm.persistent;

import com.pcm.vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 14:18
 */
public interface UserMapper {
  UserVo getUser(String userId);
}
