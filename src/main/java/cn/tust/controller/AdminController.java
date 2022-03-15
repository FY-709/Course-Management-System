package cn.tust.controller;

import cn.tust.model.Classrooms;
import cn.tust.model.Courses;
import cn.tust.model.Teachers;
import cn.tust.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping(value = "/addTeacher")
    public ModelAndView AddTeacher(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_addTeacher");

        Integer tNumber = Integer.parseInt(request.getParameter("tNumber"));
        String tName = request.getParameter("tName");
        String tMajor = request.getParameter("tMajor");
        String tContact = request.getParameter("tContact");
        String tClass = request.getParameter("tClass");

        Teachers teacher = new Teachers(tNumber, tName, tMajor, tContact, tClass);

        if (adminService.insertTeacher(teacher)) {
            mav.addObject("message", "教师信息录入成功");
        } else {
            mav.addObject("message", "教师信息录入失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }

    @RequestMapping(value = "/addCourse")
    public ModelAndView AddCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_addCourse");

        Integer cNumber = Integer.parseInt(request.getParameter("cNumber"));
        String cName = request.getParameter("cName");
        String cTeacher = request.getParameter("cTeacher");
        String cWeek = request.getParameter("cWeek");
        String cPart = request.getParameter("cPart");
        Integer cClassroom = Integer.parseInt(request.getParameter("cClassroom"));
        Integer cCount = Integer.parseInt(request.getParameter("cCount"));

        Courses course = new Courses(cNumber, cName, cTeacher, cWeek, cPart, cClassroom, cCount);

        if (adminService.insertCourse(course)) {
            mav.addObject("message", "课程信息录入成功");
        } else {
            mav.addObject("message", "课程信息录入失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }

    @RequestMapping(value = "/addClassroom")
    public ModelAndView AddClassroom(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_addClassroom");

        Integer rNumber = Integer.parseInt(request.getParameter("rNumber"));
        Integer rCount = Integer.parseInt(request.getParameter("rCount"));
        Byte rMultiMedia = Byte.valueOf(request.getParameter("rMultiMedia"));

        Classrooms classroom = new Classrooms(rNumber, rCount, rMultiMedia);

        if (adminService.insertClassroom(classroom)) {
            mav.addObject("message", "教室信息录入成功");
        } else {
            mav.addObject("message", "教室信息录入失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }

    @RequestMapping(value = "/selectTeacher")
    public ModelAndView SelectTeacher() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeTeacher");

        List<Teachers> teachers = adminService.selectTeacher();
        mav.addObject("teachers", teachers);

        return mav;
    }

    @RequestMapping(value = "/changeTeacher")
    public ModelAndView ChangeTeacher(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeTeacher");

        Integer tNumber = Integer.parseInt(request.getParameter("tNumber"));
        String tName = request.getParameter("tName");
        String tMajor = request.getParameter("tMajor");
        String tContact = request.getParameter("tContact");
        String tClass = request.getParameter("tClass");

        Teachers teacher = new Teachers(tNumber, tName, tMajor, tContact, tClass);

        if (adminService.updateTeacher(teacher)) {
            mav.addObject("message", "教师信息修改成功");
        } else {
            mav.addObject("message", "教师信息修改失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }

    @RequestMapping(value = "/selectCourse")
    public ModelAndView SelectCourse() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeCourse");

        List<Courses> courses = adminService.selectCourses();
        mav.addObject("courses", courses);

        return mav;
    }

    @RequestMapping(value = "/changeCourse")
    public ModelAndView ChangeCourse(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeCourse");

        Integer cNumber = Integer.parseInt(request.getParameter("cNumber"));
        String cName = request.getParameter("cName");
        String cTeacher = request.getParameter("cTeacher");
        String cWeek = request.getParameter("cWeek");
        String cPart = request.getParameter("cPart");
        Integer cClassroom = Integer.parseInt(request.getParameter("cClassroom"));
        Integer cCount = Integer.parseInt(request.getParameter("cCount"));

        Courses course = new Courses(cNumber, cName, cTeacher, cWeek, cPart, cClassroom, cCount);

        if (adminService.updateCourse(course)) {
            mav.addObject("message", "课程信息修改成功");
        } else {
            mav.addObject("message", "课程信息修改失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }

    @RequestMapping(value = "/selectClassroom")
    public ModelAndView SelectClassroom() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeClassroom");

        List<Classrooms> classrooms = adminService.selectClassrooms();
        mav.addObject("classrooms", classrooms);

        return mav;
    }

    @RequestMapping(value = "/changeClassroom")
    public ModelAndView ChangeClassroom(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin_changeClassroom");

        Integer rNumber = Integer.parseInt(request.getParameter("rNumber"));
        Integer rCount = Integer.parseInt(request.getParameter("rCount"));
        Byte rMultiMedia = Byte.valueOf(request.getParameter("rMultiMedia"));

        Classrooms classroom = new Classrooms(rNumber, rCount, rMultiMedia);

        if (adminService.updateClassroom(classroom)) {
            mav.addObject("message", "教室信息修改成功");
        } else {
            mav.addObject("message", "教室信息修改失败");
        }

        mav.setViewName("menu_admin");
        return mav;
    }
}
