package model;

import javax.persistence.*;
import java.util.Objects;
@Entity(name = "Purchase_item")
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Purchase purchase;
    private int amount;
    private int unityValue;

    public PurchaseItem() {}

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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
        return "PurchaseItem{" +
                "id=" + id +
                ", product=" + product +
                ", purchase=" + purchase +
                ", amount=" + amount +
                ", unityValue=" + unityValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseItem that = (PurchaseItem) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
