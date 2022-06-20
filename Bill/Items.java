package com.company.Bill;

public class Items {
    private String itemName;
    private int quantity;
    private int price;
    private int totalCost;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public Items(String itemName, int quantity, int price, int totalCost) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalCost=" + totalCost +
                '}';
    }
}

