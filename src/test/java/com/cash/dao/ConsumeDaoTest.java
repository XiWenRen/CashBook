package com.cash.dao;

import com.cash.pojo.Consume;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
