package cn.tust.service;

import cn.tust.model.Courses;
import cn.tust.model.Students;
import cn.tust.model.Timetable;

import java.util.List;

public interface TeachersService {
    boolean updateTimetable(Timetable timetable);

    Courses selectCnumber(Integer tNumber);

    List<Students> selectStudent(Integer tNumber);
}
