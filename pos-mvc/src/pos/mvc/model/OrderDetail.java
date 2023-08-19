/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author anush
 */
public class OrderDetail {
    private int id;
    private int itemId;
    private int qty;
    private double unitPrice;
    private String name;

    public OrderDetail() {
    }

    public OrderDetail(int id, int itemId, int qty, double unitPrice, String name) {
        this.id = id;
        this.itemId = itemId;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "id=" + id + ", itemId=" + itemId + ", qty=" + qty + ", unitPrice=" + unitPrice + ", name=" + name + '}';
    }
}
