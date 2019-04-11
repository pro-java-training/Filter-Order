package com.codve;

import javax.servlet.*;
import java.io.IOException;

public class FilterA implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        System.out.println("Entering FilterA.doFilter().");
        chain.doFilter(request, response); // 将请求传递到下一个filter
        System.out.println("Leaving FilterA.doFilter().");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
