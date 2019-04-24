package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private BillReceive billReceive;
    @ManyToOne
    private Cashier cashier;
    @Temporal(TemporalType.DATE)
    private Date receiptDay;
    private float receiptValue;
    private float additions;
    private float discount;
    private boolean status;

    public Receipt() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BillReceive getBillReceive() {
        return billReceive;
    }

    public void setBillReceive(BillReceive billReceive) {
        this.billReceive = billReceive;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Date getReceiptDay() {
        return receiptDay;
    }

    public void setReceiptDay(Date receiptDay) {
        this.receiptDay = receiptDay;
    }

    public float getReceiptValue() {
        return receiptValue;
    }

    public void setReceiptValue(float receiptValue) {
        this.receiptValue = receiptValue;
    }

    public float getAdditions() {
        return additions;
    }

    public void setAdditions(float additions) {
        this.additions = additions;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", billReceive=" + billReceive +
                ", cashier=" + cashier +
                ", receiptDay=" + receiptDay +
                ", receiptValue=" + receiptValue +
                ", additions=" + additions +
                ", discount=" + discount +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return getId() == receipt.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
