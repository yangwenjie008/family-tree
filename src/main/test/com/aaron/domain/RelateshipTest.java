package com.aaron.domain;

import com.aaron.exception.ApplicationException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Created by yangwj5 on 2017/3/26 at 16:10.
 */
public class RelateshipTest {

    @Test
    public void testToString() throws Exception {
        System.out.println(Relateship.SON.toString());
    }

    @Test(expected = ApplicationException.class)
    public void testFormRelateship() throws ApplicationException {
        Relateship.formRelateship("哈哈");
        Assert.assertTrue(Relateship.formRelateship("儿子").equals(Relateship.SON));
        Assert.assertTrue(Relateship.valueOf("SON").equals(Relateship.SON));
        Assert.assertTrue(Relateship.SON.getName().equals("儿子"));

    }
}