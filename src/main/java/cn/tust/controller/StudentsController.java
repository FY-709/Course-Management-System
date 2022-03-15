package cn.tust.controller;

import cn.tust.model.Courses;
import cn.tust.model.Scores;
import cn.tust.model.Timetable;
import cn.tust.model.TimetableKey;
import cn.tust.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentsController {
    @Resource
    private StudentsService studentsService;

    @RequestMapping(value = "/selectUnchosenCourse")
    public ModelAndView SelectUnchosenCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_chooseCourse");

        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));

        List<Courses> courses = studentsService.selectUnchosenCourse(sNumber);
        mav.addObject("courses", courses);

        return mav;
    }

    @RequestMapping(value = "/chooseCourse")
    public ModelAndView ChooseCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_chooseCourse");

        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));
        Integer cNumber = Integer.parseInt(request.getParameter("cNumber"));

        Courses course = studentsService.selectCourse(cNumber);
        Integer cCount = course.getCcount();
        String cWeek = course.getCweek();
        String cPart = course.getCpart();

        List<Courses> chosenCoursesList = studentsService.selectChosenCourse(sNumber);

        mav.addObject("chosenCoursesList", chosenCoursesList);

        Timetable timetable = new Timetable(sNumber, cNumber, null);
        if (cCount == null || cCount > studentsService.countTimetable(cNumber)) {
            for (Courses c : chosenCoursesList) {
                if (c.getCweek().equals(cWeek) && c.getCpart().equals(cPart)) {
                    mav.addObject("message", "与已选课程时间冲突");
                    mav.setViewName("menu_student");
                    return mav;
                }
            }
            if (studentsService.insertTimetable(timetable)) {
                mav.addObject("message", "选课成功");
            } else {
                mav.addObject("message", "选课失败");
            }
        } else {
            mav.addObject("message", "已达限选人数");
        }

        mav.setViewName("menu_student");
        return mav;
    }

    @RequestMapping(value = "/selectChosenCourse")
    public ModelAndView SelectChosenCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_cancelCourse");

        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));

        List<Courses> courses = studentsService.selectChosenCourse(sNumber);
        mav.addObject("courses", courses);

        return mav;
    }

    @RequestMapping(value = "/cancelCourse")
    public ModelAndView CancelCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_cancelCourse");

        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));
        Integer cNumber = Integer.parseInt(request.getParameter("cNumber"));

        TimetableKey timetableKey = new TimetableKey(sNumber, cNumber);

        if (studentsService.deleteTimetable(timetableKey)) {
            mav.addObject("message", "退课成功");
        } else {
            mav.addObject("message", "退课失败");
        }

        mav.setViewName("menu_student");
        return mav;
    }

    @RequestMapping(value = "/checkSource")
    public ModelAndView CheckSource(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_checkSource");

        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));

        List<Scores> scores = studentsService.selectScores(sNumber);
        mav.addObject("scores", scores);

        return mav;
    }
}
