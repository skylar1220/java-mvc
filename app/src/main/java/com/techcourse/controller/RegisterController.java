package com.techcourse.controller;

import com.interface21.webmvc.servlet.mvc.asis.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterController implements Controller {

    @Override
    public String execute(final HttpServletRequest req, final HttpServletResponse res) {
//        final var user = new User(2,
//                req.getParameter("account"),
//                req.getParameter("password"),
//                req.getParameter("email"));
//            InMemoryUserRepository.save(user);

        return "redirect:/index.jsp";
    }
}
