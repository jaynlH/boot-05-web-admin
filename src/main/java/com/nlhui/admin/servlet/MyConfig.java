//package com.nlhui.admin.servlet;
//
//import com.nlhui.admin.servlet.MyFilter;
//import com.nlhui.admin.servlet.MyListener;
//import com.nlhui.admin.servlet.MyServlet;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
//@Configuration(proxyBeanMethods = true)
//public class MyConfig {
//    @Bean
//    public ServletRegistrationBean registServlet(){
//        MyServlet myServlet = new MyServlet();
//        ServletRegistrationBean<MyServlet> myServletServletRegistrationBean = new ServletRegistrationBean<>(myServlet,"/my","/my03");
//        return  myServletServletRegistrationBean;
//    }
//    @Bean
//    public FilterRegistrationBean registFilter(){
//        MyFilter myFilter = new MyFilter();
//        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>(myFilter);
//        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/css/*","/my"));
//        return myFilterFilterRegistrationBean;
//    }
//    @Bean
//    public ServletListenerRegistrationBean registListener(){
//        MyListener myListener = new MyListener();
//        ServletListenerRegistrationBean<MyListener> myListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>(myListener);
//        return myListenerServletListenerRegistrationBean;
//
//    }
//}
