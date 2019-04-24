package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
/*Classe de contas a pagar*/
@Entity
public class BillPay {
    /*Esta classe trabalha com os pagamentos que ainda serão efetuados pela empresa*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Purchase purchase;
    private float portionValue;
    @Column(length = 25)
    private String paymentMethod;
    private int portionNumber;
    private int portionRemaining;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    private boolean status;

    public BillPay() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public float getPortionValue() {
        return portionValue;
    }

    public void setPortionValue(float portionValue) {
        this.portionValue = portionValue;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPortionNumber() {
        return portionNumber;
    }

    public void setPortionNumber(int portionNumber) {
        this.portionNumber = portionNumber;
    }

    public int getPortionRemaining() {
        return portionRemaining;
    }

    public void setPortionRemaining(int portionRemaining) {
        this.portionRemaining = portionRemaining;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BillPay{" +
                "id=" + id +
                ", purchase=" + purchase +
                ", portionValue=" + portionValue +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", portionNumber=" + portionNumber +
                ", portionRemaining=" + portionRemaining +
                ", dueDate=" + dueDate +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillPay billPay = (BillPay) o;
        return getId() == billPay.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
