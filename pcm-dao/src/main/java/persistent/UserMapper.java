package persistent;

import org.apache.ibatis.annotations.Param;
import vo.UserVo;

/**
 * @author <a href="mailto:157224@ycgwl.com">Guo chengxi</a>
 * @createDate 2018/8/6 14:18
 */
public interface UserMapper {

    void addUser( UserVo user);
}
