package com.aaron.dao.impl;

import com.aaron.dao.PersonDao;
import com.aaron.dao.base.BaseDao;
import com.aaron.domain.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by yangwj5 on 2017/3/26 at 17:07.
 */

public class PersonDaoImpl extends BaseDao implements PersonDao {

    @Override
    public List<Person> findPersonsByPerson(Person person) {
        String sql = "";
        Map<String, String> map = new HashMap<String, String>();
        this.namedParameterJdbcTemplate.queryForList(sql, map, Person.class);
        return null;
    }

    @Override
    public List<Person> findChilerenByPerson(Person person) {
        return null;
    }

    @Override
    public List<Person> findParentByPerson(Person person) {
        return null;
    }

    @Override
    public boolean isCoupleRelationship(Person man, Person woman) {
        return false;
    }
}
