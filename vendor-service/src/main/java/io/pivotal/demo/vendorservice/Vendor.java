package io.pivotal.demo.vendorservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vendor {
    @Id @GeneratedValue
    private Long id;
    private String name;

    public Long getRefId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
