package com.example.tcm.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("进入拦截");
        System.out.println(request.getRequestURI());
        //登陆不做拦截
        if (request.getRequestURI().equals("/login.html")){
            System.out.println("200");
            return true;
        }
        //进行逻辑判断，如果ok就返回true，不行就返回false，返回false就不会处理改请求
        if (request.getSession().getAttribute("SESSION_USER")==null){
            response.sendRedirect("login.html");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}
