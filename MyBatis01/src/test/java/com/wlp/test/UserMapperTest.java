package com.wlp.test;

import com.wlp.dao.UserMapper;
import com.wlp.pojo.User;
import com.wlp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author wlp
 * @create 2021-03-29 16:59
 */
public class UserMapperTest {
    @Test
    public void test(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for(User user : userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
