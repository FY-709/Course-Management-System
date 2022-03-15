package cn.tust.service.impl;

import cn.tust.dao.StudentsMapper;
import cn.tust.dao.UsersMapper;
import cn.tust.model.Students;
import cn.tust.model.Users;
import cn.tust.model.UsersExample;
import cn.tust.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public boolean insertStudent(Students student) {
        return studentsMapper.insert(student) == 1;
    }

    @Override
    public boolean insertUser(Users user) {
        return usersMapper.insert(user) == 1;
    }

    @Override
    public boolean selectUser(String uName, String uPassword, String uType) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();

        criteria.andUnameEqualTo(uName)
                .andUpasswordEqualTo(uPassword)
                .andUtypeEqualTo(uType);

        List<Users> result = usersMapper.selectByExample(usersExample);
        return result != null;
    }
}
