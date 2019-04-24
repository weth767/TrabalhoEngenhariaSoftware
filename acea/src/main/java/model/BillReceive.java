package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class BillReceive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Sale sale;
    private float portionValue;
    @Column(length = 25)
    private String receiptMethod;
    private int portionNumber;
    private int portionRemaining;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    private boolean status;

    public BillReceive() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public float getPortionValue() {
        return portionValue;
    }

    public void setPortionValue(float portionValue) {
        this.portionValue = portionValue;
    }

    public String getReceiptMethod() {
        return receiptMethod;
    }

    public void setReceiptMethod(String receiptMethod) {
        this.receiptMethod = receiptMethod;
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
        return "BillReceive{" +
                "id=" + id +
                ", sale=" + sale +
                ", portionValue=" + portionValue +
                ", receiptMethod='" + receiptMethod + '\'' +
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
        BillReceive that = (BillReceive) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
