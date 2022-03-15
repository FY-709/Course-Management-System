package cn.tust.service.impl;

import cn.tust.dao.ClassroomsMapper;
import cn.tust.dao.CoursesMapper;
import cn.tust.dao.TeachersMapper;
import cn.tust.model.*;
import cn.tust.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TeachersMapper teachersMapper;
    @Autowired
    private CoursesMapper coursesMapper;
    @Autowired
    private ClassroomsMapper classroomsMapper;

    @Override
    public boolean insertTeacher(Teachers teacher) {
        return teachersMapper.insertSelective(teacher) == 1;
    }

    @Override
    public boolean insertCourse(Courses course) {
        return coursesMapper.insertSelective(course) == 1;
    }

    @Override
    public boolean insertClassroom(Classrooms classroom) {
        return classroomsMapper.insertSelective(classroom) == 1;
    }

    @Override
    public boolean updateTeacher(Teachers teacher) {
        return teachersMapper.updateByPrimaryKey(teacher) == 1;
    }

    @Override
    public boolean updateCourse(Courses course) {
        return coursesMapper.updateByPrimaryKey(course) == 1;
    }

    @Override
    public boolean updateClassroom(Classrooms classroom) {
        return classroomsMapper.updateByPrimaryKey(classroom) == 1;
    }

    @Override
    public List<Teachers> selectTeacher() {
        TeachersExample teachersExample = new TeachersExample();
        return teachersMapper.selectByExample(teachersExample);
    }

    @Override
    public List<Courses> selectCourses() {
        CoursesExample coursesExample = new CoursesExample();
        return coursesMapper.selectByExample(coursesExample);
    }

    @Override
    public List<Classrooms> selectClassrooms() {
        ClassroomsExample classroomsExample = new ClassroomsExample();
        return classroomsMapper.selectByExample(classroomsExample);
    }
}
