package io.pivotal.demo.budgetservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(name = "summary", types = Transaction.class)
public interface TransactionProjection {
    Date getDate();
    Double getAmount();
    @Value("#{@vendorLookup.getVendor(target.vendorId)}")
    Vendor getVendor();
    String getDescription();
}
