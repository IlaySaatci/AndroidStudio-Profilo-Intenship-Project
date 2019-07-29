package com.example.attempt;

public class CartInformation {
    private String CardNum;
    private String Owner;
    private String ccv;
    private String date;

    public String getCardNum() {
        return CardNum;
    }

    public String getOwner() {
        return Owner;
    }

    public String getCcv() {
        return ccv;
    }

    public String getDate() {
        return date;
    }



    public void setCardNum(String cardNum) {
        CardNum = cardNum;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public void setDate(String date) {
       this.date=date;

    }


}



