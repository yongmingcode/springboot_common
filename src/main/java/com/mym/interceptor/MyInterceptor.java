package com.mym.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Aming
 * @date 2019/4/15 22:15
 * @desc
 */
@Configuration//声明这是一个配置
public class MyInterceptor extends WebMvcConfigurerAdapter {
    /**
     * {@inheritDoc}
     * <p>This implementation is empty.
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //1.创建一个拦截器
        HandlerInterceptor inter = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("preHandle前置拦截器！");
                return true;
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
                System.out.println("postHandle后置拦截器");
            }

            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
                System.out.println("afterCompletion自定义拦截器");
            }
        };

        //2.注册拦截器并指明拦截路径（"/**"表示拦截所有）
        registry.addInterceptor(inter).addPathPatterns("/**");

    }
}
