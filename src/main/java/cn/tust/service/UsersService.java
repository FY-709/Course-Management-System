package cn.tust.service;

import cn.tust.model.Students;
import cn.tust.model.Users;

public interface UsersService {
    boolean insertStudent(Students student);

    boolean insertUser(Users user);

    boolean selectUser(String uName, String uPassword, String uType);
}
