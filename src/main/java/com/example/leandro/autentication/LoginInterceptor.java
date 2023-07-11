package com.example.leandro.autentication;


import com.example.leandro.services.CookieService;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        if(CookieService.getCookie(request,"usuarioID") !=null){
            return true;
        }else{
            response.sendRedirect("/login");
            return false;
        }
    }
}