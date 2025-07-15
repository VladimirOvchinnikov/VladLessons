package com.vlad.mybat.util;

import java.util.Map;

public class Filter {

    private String name;
    private Map<String, Object> filterMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getFilterMap() {
        return filterMap;
    }

    public void setFilterMap(Map<String, Object> filterMap) {
        this.filterMap = filterMap;
    }
}
