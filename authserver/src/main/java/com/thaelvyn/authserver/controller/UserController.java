package com.thaelvyn.authserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.security.Principal;

/**
 * @author Julien Frisquet
 */
@Controller
@SessionAttributes("authorizationRequest")
public class UserController {

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(final Principal user) {
        return user;
    }


}
