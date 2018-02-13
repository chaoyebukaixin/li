package com.li.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by tanke on 2018/2/12.
 */
/*
*作者：李潮
*时间：2018/2/12
*类名：FirstWebFilter
*/
@WebFilter(value = "/*")
public class FirstWebFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("name", "lichao");
        chain.doFilter(request, response);
    }

    public void destroy() {
        System.out.println("filter destroy");
    }
}
