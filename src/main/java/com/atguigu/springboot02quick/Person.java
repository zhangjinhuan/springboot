package com.atguigu.springboot02quick;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    //@Value("${person.name}")
    //@Email
    private String name;
    //@Value("#{12*2}")
    private int age;
    //@Value("true")
    private boolean boss;
    private Date birthday;
    private Map maps;
    private List lists;
    private List lists2;
    private Dog dog;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", lists2=" + lists2 +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public List getLists2() {
        return lists2;
    }

    public void setLists2(List lists2) {
        this.lists2 = lists2;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person(String name, int age, boolean boss, Date birthday, Map maps, List lists, List lists2, Dog dog) {

        this.name = name;
        this.age = age;
        this.boss = boss;
        this.birthday = birthday;
        this.maps = maps;
        this.lists = lists;
        this.lists2 = lists2;
        this.dog = dog;
    }
}
