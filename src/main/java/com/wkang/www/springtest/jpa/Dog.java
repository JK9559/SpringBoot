package com.wkang.www.springtest.jpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    private String name;

    public Dog(){

    }

    public Dog(Integer id,Integer age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
