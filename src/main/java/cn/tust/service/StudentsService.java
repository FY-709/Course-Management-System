package cn.tust.service;

import cn.tust.model.Courses;
import cn.tust.model.Scores;
import cn.tust.model.Timetable;
import cn.tust.model.TimetableKey;

import java.util.List;

public interface StudentsService {
    boolean insertTimetable(Timetable timetable);

    boolean deleteTimetable(TimetableKey timetableKey);

    long countTimetable(Integer cNumber);

    List<Courses> selectChosenCourse(Integer sNumber);

    List<Courses> selectUnchosenCourse(Integer sNumber);

    Courses selectCourse(Integer cNumber);

    List<Scores> selectScores(Integer sNumber);
}
