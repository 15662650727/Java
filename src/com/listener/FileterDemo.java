package com.listener;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName FileterDemo
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-7-19 13:17
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class FileterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (!(request instanceof HttpServletRequest) || !(response instanceof HttpServletResponse)) {
            throw new ServletException("OncePerRequestFilter just supports HTTP requests");
        }
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        filterChain.doFilter(httpRequest, httpResponse);
        //httpResponse.sendRedirect("http://www.baidu.com");
    }

    @Override
    public void destroy() {

    }
}
