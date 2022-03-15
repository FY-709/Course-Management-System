package cn.tust.dao;

import cn.tust.model.Courses;
import cn.tust.model.Scores;
import cn.tust.model.Students;

import java.util.List;

public interface MySqlMapper {
    List<Courses> selectChosenCourses(Integer sNumber);

    List<Courses> selectUnchosenCourses(Integer sNumber);

    List<Scores> selectScores(Integer sNumber);

    List<Students> selectStudents(Integer tNumber);

    Courses selectCnumber(Integer tNumber);
}
