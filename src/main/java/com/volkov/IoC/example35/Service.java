package com.volkov.IoC.example35;



public class Service {

    private ExampleBean exampleBean;

    public ExampleBean getExampleBean() {
        return exampleBean;
    }

    public void setExampleBean(ExampleBean exampleBean) {
        this.exampleBean = exampleBean;
    }
}
