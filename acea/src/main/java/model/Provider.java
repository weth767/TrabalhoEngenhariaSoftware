package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@PrimaryKeyJoinColumn(name = "person_id")
public class Provider extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, unique = true)
    private String socialName;
    @Column(length = 14, unique = true)
    private String cnpj;
    @Column(length = 14)
    private String stateRegistration;
    private boolean status;

    public Provider() {}

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", socialName='" + socialName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", stateRegistration='" + stateRegistration + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Provider provider = (Provider) o;
        return getId() == provider.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
