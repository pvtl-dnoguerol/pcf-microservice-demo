package io.pivotal.demo.budgetservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private Double amount;
    private Long vendorId;
    private String description;

    public Date getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public String getDescription() {
        return description;
    }
}
