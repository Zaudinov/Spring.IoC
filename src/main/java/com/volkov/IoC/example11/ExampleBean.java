package com.volkov.IoC.example11;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleBean {
    private List<Object> list;
    private Set<Object> set;
    private Map<String, Object> map;

    public ExampleBean() {
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

}
