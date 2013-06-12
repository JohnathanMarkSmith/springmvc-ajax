package com.johnathanmarksmith.domain;


/**
 * Date:   6/12/13 / 7:49 AM
 * Author: Johnathan Mark Sm
 * Email:  johnathansmith1969@gmail.com
 * <p/>
 * Comments:
 * <p/>
 * This is the domain/model Person object that we use
 */


public class Person
{

    private String name;
    private Integer age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", age=" + age + "]";
    }


}
