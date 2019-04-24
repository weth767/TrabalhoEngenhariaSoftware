package model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Sale_item")
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;
    private int amount;
    private int unityValue;

    public SaleItem() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnityValue() {
        return unityValue;
    }

    public void setUnityValue(int unityValue) {
        this.unityValue = unityValue;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "id=" + id +
                ", product=" + product +
                ", sale=" + sale +
                ", amount=" + amount +
                ", unityValue=" + unityValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleItem saleItem = (SaleItem) o;
        return getId() == saleItem.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
