package com.cash.dao;

import com.cash.domain.Bill;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillMapperTest extends SuperTest{

    @Autowired
    private BillMapper billMapper;

    @Test
    public void selectAllBillTest(){
        List<Bill> billList = billMapper.selectAllBill();
        for (Bill bill : billList) {
            System.out.println(bill);
        }
    }
}
