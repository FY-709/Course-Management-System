package cn.tust.service.impl;

import cn.tust.dao.CoursesMapper;
import cn.tust.dao.MySqlMapper;
import cn.tust.dao.TimetableMapper;
import cn.tust.model.*;
import cn.tust.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private TimetableMapper timetableMapper;
    @Autowired
    private CoursesMapper coursesMapper;
    @Autowired
    private MySqlMapper mySqlMapper;

    @Override
    public boolean insertTimetable(Timetable timetable) {
        return timetableMapper.insert(timetable) == 1;
    }

    @Override
    public boolean deleteTimetable(TimetableKey timetableKey) {
        return timetableMapper.deleteByPrimaryKey(timetableKey) == 1;
    }

    @Override
    public long countTimetable(Integer sNumber) {
        TimetableExample timetableExample = new TimetableExample();
        TimetableExample.Criteria criteria = timetableExample.createCriteria();

        criteria.andSnumberEqualTo(sNumber);

        return timetableMapper.countByExample(timetableExample);
    }

    @Override
    public List<Courses> selectChosenCourse(Integer sNumber) {
        return mySqlMapper.selectChosenCourses(sNumber);
    }

    @Override
    public List<Courses> selectUnchosenCourse(Integer sNumber) {
        return mySqlMapper.selectUnchosenCourses(sNumber);
    }

    @Override
    public Courses selectCourse(Integer cNumber) {
        return coursesMapper.selectByPrimaryKey(cNumber);
    }

    @Override
    public List<Scores> selectScores(Integer sNumber) {
        return mySqlMapper.selectScores(sNumber);
    }
}
