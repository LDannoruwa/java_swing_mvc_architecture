/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author anush
 */
public class Item {
    private Integer id;
    private String name;
    private Integer qtyOnHand;
    private Double unitPrice;

    public Item() {
    }

    public Item(Integer id, String name, Integer qtyOnHand, Double unitPrice) {
        this.id = id;
        this.name = name;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(Integer qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + '}';
    }
}
