package cn.tust.service.impl;

import cn.tust.dao.MySqlMapper;
import cn.tust.dao.TimetableMapper;
import cn.tust.model.Courses;
import cn.tust.model.Students;
import cn.tust.model.Timetable;
import cn.tust.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    private MySqlMapper mySqlMapper;
    @Autowired
    private TimetableMapper timetableMapper;

    @Override
    public boolean updateTimetable(Timetable timetable) {
        return timetableMapper.updateByPrimaryKey(timetable) == 1;
    }

    @Override
    public Courses selectCnumber(Integer tNumber) {
        return mySqlMapper.selectCnumber(tNumber);
    }

    @Override
    public List<Students> selectStudent(Integer tNumber) {
        return mySqlMapper.selectStudents(tNumber);
    }
}
