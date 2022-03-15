package cn.tust.controller;

import cn.tust.model.Courses;
import cn.tust.model.Students;
import cn.tust.model.Timetable;
import cn.tust.service.TeachersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/teacher")
public class TeachersController {
    @Resource
    private TeachersService teachersService;

    @RequestMapping(value = "/selectStudent")
    public ModelAndView SelectStudent(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("teacher_addSource");

        Integer tNumber = Integer.parseInt(request.getParameter("tNumber"));

        List<Students> students = teachersService.selectStudent(tNumber);
        mav.addObject("students", students);

        return mav;
    }

    @RequestMapping(value = "/addSource")
    public ModelAndView AddSource(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("teacher_addSource");

        Integer tNumber = Integer.parseInt(request.getParameter("tNumber"));
        Integer sNumber = Integer.parseInt(request.getParameter("sNumber"));
        Integer cScore = Integer.parseInt(request.getParameter("cScore"));

        Courses courses = teachersService.selectCnumber(tNumber);
        Integer cNumber = courses.getCnumber();

        Timetable timetable = new Timetable(sNumber, cNumber, cScore);

        if (teachersService.updateTimetable(timetable)) {
            mav.addObject("message", "成绩添加成功");
        } else {
            mav.addObject("message", "成绩添加失败");
        }

        mav.setViewName("menu_teacher");
        return mav;
    }
}
