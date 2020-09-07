package club.codedemo.springbeanannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 6. @Controller 注解
 * 启动项目后，打开浏览器输入http://localhost:8080/hello将显示欢迎信息
 */
@Controller
public class StudentController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
