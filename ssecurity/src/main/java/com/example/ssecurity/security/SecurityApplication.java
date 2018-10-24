package com.example.ssecurity.security;

import com.example.ssecurity.security.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tao
 */
@SpringBootApplication
@Controller
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }


    @RequestMapping("/index")
    @ResponseBody
    public String text(HttpServletRequest request) {
//        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
//                .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
//        User u = (User) securityContextImpl.getAuthentication().getPrincipal();

        User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return u.getUsername();
    }
}
