package model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Cashier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private int cashierNumber;
    private Time openingTime;
    private Time closingTime;
    private float openingValue;
    private float closingValue;
    @ManyToMany
    @JoinTable(name = "Cashier_Payment", joinColumns = @JoinColumn(name = "cashier_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id"))
    private List<Payment> payments;
    private boolean status;

    public Cashier() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCashierNumber() {
        return cashierNumber;
    }

    public void setCashierNumber(int cashierNumber) {
        this.cashierNumber = cashierNumber;
    }

    public Time getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Time openingTime) {
        this.openingTime = openingTime;
    }

    public Time getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Time closingTime) {
        this.closingTime = closingTime;
    }

    public float getOpeningValue() {
        return openingValue;
    }

    public void setOpeningValue(float openingValue) {
        this.openingValue = openingValue;
    }

    public float getClosingValue() {
        return closingValue;
    }

    public void setClosingValue(float closingValue) {
        this.closingValue = closingValue;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", date=" + date +
                ", cashierNumber=" + cashierNumber +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", openingValue=" + openingValue +
                ", closingValue=" + closingValue +
                ", payments=" + payments +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashier cashier = (Cashier) o;
        return getId() == cashier.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
