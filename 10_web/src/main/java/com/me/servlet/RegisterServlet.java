package com.me.servlet;

import com.me.pojo.Student;
import com.me.service.StudentService;
import com.me.util.ContextUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegisterServlet", value = "/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");

        // 创建spring的容器对象
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // 获取ServletContext中的容器对象
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        Object attribute = getServletContext().getAttribute(key);
//        System.out.println(attribute);
//        WebApplicationContext context = (WebApplicationContext) attribute;

        // 使用框架中的方法，获取容器对象
//        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        // 使用工具类
        AnnotationConfigApplicationContext context = ContextUtils.getAnnotationContext();

        // 获取service
        StudentService studentService = context.getBean("studentServiceImpl", StudentService.class);
//        Student student = new Student(null, name, gender, email);
//        studentService.insert(student);
//        System.out.println(student);
        List<Student> students = studentService.queryAll();
        students.forEach(System.out::println);


        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
