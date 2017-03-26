package com.aaron.domain;

import com.aaron.exception.ApplicationException;
import com.google.common.base.MoreObjects;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by yangwj5 on 2017/3/26 at 15:59.
 */

public enum Relateship {

    MONTHER("母亲",1), FATHER("父亲",2), DAUGHTER("女儿",3), SON("儿子",4), WIFE("妻子",5),
    HUSBAND("丈夫",6);

    private int index ;

    private String name;

    private static Map<String,Relateship> relateshipMap = new HashMap<String, Relateship>();

    Relateship(String name,int index) {
        this.index = index;
        this.name = name;
    }

    static {
        for(Relateship relateship : Relateship.values()){
            if(relateshipMap.get(relateship.getName())==null) {
                relateshipMap.put(relateship.getName(), relateship);
            }
        }
    }

    public static Relateship formRelateship(String relateshipName) throws ApplicationException {
        if (relateshipMap.get(relateshipName) == null)
        {
            throw new ApplicationException("不支持的枚举类型");
        }
        return relateshipMap.get(relateshipName);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("index", index)
                .add("name", name)
                .toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
