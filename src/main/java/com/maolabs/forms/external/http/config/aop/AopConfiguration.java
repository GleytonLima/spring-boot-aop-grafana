package com.maolabs.forms.external.primary.http.config.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class AopConfiguration {

    @Pointcut("@within(com.maolabs.forms.internal.application.Monitor) || @annotation(com.maolabs.forms.internal.application.Monitor)")
    public void beanAnnotatedWithMonitor() {}

    @Bean
    public CustomPerformanceMonitorInterceptor performanceMonitorInterceptor() {
        return new CustomPerformanceMonitorInterceptor(false);
    }

    @Bean
    public Advisor performanceMonitorAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("com.maolabs.forms.external.primary.http.config.aop.AopConfiguration.beanAnnotatedWithMonitor()");
        return new DefaultPointcutAdvisor(pointcut, performanceMonitorInterceptor());
    }
}
