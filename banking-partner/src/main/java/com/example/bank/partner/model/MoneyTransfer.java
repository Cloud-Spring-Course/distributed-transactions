package com.example.bank.partner.model;

public class MoneyTransfer {

    private String transferId;

    private String fromAccount;

    private String toAccount;

    private int amount;

    public MoneyTransfer(String transferId, String fromAccount, String toAccount, int amount) {
        this.transferId = transferId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public String getTransferId() {
        return transferId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public int getAmount() {
        return amount;
    }
}