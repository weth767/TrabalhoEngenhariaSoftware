package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private BillPay billPay;
    @Temporal(TemporalType.DATE)
    private Date paidDay;
    private float paidValue;
    private boolean status;

    public Payment() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BillPay getBillPay() {
        return billPay;
    }

    public void setBillPay(BillPay billPay) {
        this.billPay = billPay;
    }

    public Date getPaidDay() {
        return paidDay;
    }

    public void setPaidDay(Date paidDay) {
        this.paidDay = paidDay;
    }

    public float getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(float paidValue) {
        this.paidValue = paidValue;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", billPay=" + billPay +
                ", paidDay=" + paidDay +
                ", paidValue=" + paidValue +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return getId() == payment.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
