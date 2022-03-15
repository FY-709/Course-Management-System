package cn.tust.service;

import cn.tust.model.Classrooms;
import cn.tust.model.Courses;
import cn.tust.model.Teachers;

import java.util.List;

public interface AdminService {
    boolean insertTeacher(Teachers teacher);

    boolean insertCourse(Courses course);

    boolean insertClassroom(Classrooms classroom);

    boolean updateTeacher(Teachers teacher);

    boolean updateCourse(Courses course);

    boolean updateClassroom(Classrooms classroom);

    List<Teachers> selectTeacher();

    List<Courses> selectCourses();

    List<Classrooms> selectClassrooms();
}
