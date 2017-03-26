package com.aaron.service;

import com.aaron.domain.Person;

import java.util.List;

/**
 * @author Created by yangwj5 on 2017/3/26 at 15:40.
 */
public interface PersonService {
    /**
     * 查询与某人有直接关系的所有人
     * @param person
     * @return
     */
    public List<Person> findPersonsByPerson(Person person);

    /**
     * 查询与某人下面的所有子女
     * @param person
     * @return
     */
    public List<Person> findChilerenByPerson(Person person);

    /**
     * 查询某人的父母
     * @param person
     * @return
     */
    public List<Person> findParentByPerson(Person person);

    /**
     * 是否是夫妻关系
     * @param man
     * @param woman
     * @return
     */
    public boolean isCoupleRelationship(Person man,Person woman);

}
