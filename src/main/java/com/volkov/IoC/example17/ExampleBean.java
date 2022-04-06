package com.volkov.IoC.example17;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;

public class ExampleBean implements InitializingBean, DisposableBean, BeanPostProcessor, BeanClassLoaderAware, BeanNameAware {


    private String value;


//    private com.volkov.IoC.example15.ExampleBean dep;


    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method(Внутри destroy метода)");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method(Внутри метода afterPropertiesSet)");
//        System.out.println(this.getDep());

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInit");
        System.out.println(beanName);
        System.out.println(bean.toString());
        System.out.println();
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post process after Init");
        System.out.println(beanName);
        return bean;
    }

    @PostConstruct
    public void pc(){
        System.out.println("postConstruct annot");

    }

//    public com.volkov.IoC.example15.ExampleBean getDep() {
//        return dep;
//    }
//
//    public void setDep(com.volkov.IoC.example15.ExampleBean dep) {
//        this.dep = dep;
//    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name aware" + this.getValue()+"\n");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("classLoader");
//        this.setValue("Aware method changed that");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
