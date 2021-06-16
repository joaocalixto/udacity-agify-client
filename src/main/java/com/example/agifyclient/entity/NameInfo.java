package com.example.agifyclient.entity;

public class NameInfo {

    private String name;
    private Integer age;
    private Integer count;

    public NameInfo(String name, Integer age, Integer count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "NameInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                '}';
    }
}
