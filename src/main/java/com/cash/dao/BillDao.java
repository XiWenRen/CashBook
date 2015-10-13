package com.cash.dao;

import com.cash.domain.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单操作动作
 */
public class BillDao {

    public boolean addBill(Bill bill){
        return true;
    }

    public boolean deleteBill(int billId){
        return true;
    }

    public boolean updateBill(Bill bill){
        return true;
    }

    public Bill getBillById(int billId){
        return new Bill();
    }

    //都会限制一次取到的时间范围
    public List<Bill> getBillListByUserId(int userId){
        return new ArrayList<>();
    }

    public List<Bill> getBillListByConsume(int consumeId){
        return new ArrayList<>();
    }
}
