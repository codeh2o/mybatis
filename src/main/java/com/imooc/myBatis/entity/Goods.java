package com.imooc.myBatis.entity;

public class Goods {
    private int GoodsId;
    private String title;
    private String subTitle;
    private float originnalCost;
    private float currentPrice;
    private float discount;
    private Boolean isFreeDelivery;
    private int categoryId;

    public int getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(int goodsId) {
        GoodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public float getOriginnalCost() {
        return originnalCost;
    }

    public void setOriginnalCost(float originnalCost) {
        this.originnalCost = originnalCost;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Boolean getFreeDelivery() {

        return isFreeDelivery;
    }

    public void setFreeDelivery(Boolean freeDelivery) {
        isFreeDelivery = freeDelivery;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
