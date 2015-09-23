package com.cash.pojo;

public class Consume {
    private int consumeId;
    private String consumeName;

    public int getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(int consumeId) {
        this.consumeId = consumeId;
    }

    public String getConsumeName() {
        return consumeName;
    }

    public void setConsumeName(String consumeName) {
        this.consumeName = consumeName;
    }

    @Override
    public String toString() {
        return "Consume{" +
                "consumeId=" + consumeId +
                ", consumeName='" + consumeName + '\'' +
                '}';
    }
}
