package com.cash.pojo;

import java.sql.Date;

/**
 * 2.Bill{"bill_id","amount","consume_type","time","payment_type","remark","user_id","in_or_out"}
 */
public class Bill {

    private int billId;
    private double amount;
    private Consume consume;
    private Date recordTime;
    private String paymentType;
    private String remark;
    //0:in or 1:out;
    private int inOrOut;
    //TODO
    private int userId;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Consume getConsume() {
        return consume;
    }

    public void setConsume(Consume consume) {
        this.consume = consume;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(int inOrOut) {
        this.inOrOut = inOrOut;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Bill{" +
                ", amount=" + amount +
                ", consumeType='" + consume + '\'' +
                ", recordTime=" + recordTime +
                ", paymentType='" + paymentType + '\'' +
                ", remark='" + remark + '\'' +
                ", inOrOut=" + inOrOut +
                ", userId=" + userId +
                '}';
    }
}
