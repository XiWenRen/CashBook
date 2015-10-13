package com.cash.dao;

import org.junit.Test;

/**
 * Created by MyPC on 2015/9/24.
 */
public class ConsumeDaoTest {
    ConsumeDao dao = new ConsumeDao();

    public void addConsumeTest(){
    }

    @Test
    public void getConsumeListTest(){
        dao.getConsumeListByUser(1);
    }
}
