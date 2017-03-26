package com.aaron.domain;

import org.junit.Before;

/**
 * @author Created by yangwj5 on 2017/3/26 at 15:25.
 */
public class PersonTest {

    public Person person;

    @Before
    public void setUp(){
        person = new Person();
        person.setName("Aaron");
        person.setAge("18");
        person.setSex("男");
        person.setAddress("男");
        person.setTelephone("12234566");
        person.setPhoto("f:/");
    }

    @org.junit.Test
    public void testToString() throws Exception {
        System.out.println(person.toString());
    }
}