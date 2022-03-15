package cn.tust.controller;

import cn.tust.model.Students;
import cn.tust.model.Users;
import cn.tust.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping(value = "/loginUser")
    public ModelAndView LoginUser(HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();

        String uName = request.getParameter("uName");
        String uPassword = request.getParameter("uPassword");
        String uType = request.getParameter("uType");

        if (uName.isEmpty() || uPassword.isEmpty()) {
            mav.addObject("message", "账号或密码不能为空");
            mav.setViewName("page_loginUser");
            return mav;
        } else if (usersService.selectUser(uName, uPassword, uType)) {
            session.setAttribute("uName", uName);
            /*Cookie cookie = new Cookie("uName", uName);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);*/

            mav.addObject("message", "登录成功");
            switch (uType) {
                case "学生":
                    mav.setViewName("menu_student");
                    return mav;
                case "教师":
                    mav.setViewName("menu_teacher");
                    return mav;
                case "管理员":
                    mav.setViewName("menu_admin");
                    return mav;
            }
        } else {
            mav.addObject("message", "账号或密码错误");
            mav.setViewName("page_loginUser");
            return mav;
        }

        return mav;
    }

    @RequestMapping(value = "/regUser")
    public ModelAndView RegUser(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();

        String uName = request.getParameter("uName");
        String uPassword = request.getParameter("uPassword");

        Integer sNumber = Integer.parseInt(uName);
        String sName = request.getParameter("sName");
        Integer sClass = Integer.parseInt(request.getParameter("sClass"));
        Integer sAge = Integer.parseInt(request.getParameter("sAge"));

        Users user = new Users(uName, uPassword, "学生");
        Students student = new Students(sNumber, sName, sClass, sAge);

        if (usersService.insertUser(user) && (usersService.insertStudent(student))) {
            mav.addObject("message", "注册成功，请登录");
            mav.setViewName("page_loginUser");
        } else {
            mav.addObject("message", "注册失败，请刷新后重试");
            mav.setViewName("page_regUser");
        }

        return mav;
    }
}
