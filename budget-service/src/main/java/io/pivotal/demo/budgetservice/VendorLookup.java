package io.pivotal.demo.budgetservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorLookup {
    @Autowired
    VendorProxy vendorProxy;

    @HystrixCommand(fallbackMethod="getDefaultVendor")
    public Vendor getVendor(long id) {
        return vendorProxy.getVendor(id);
    }

    public Vendor getDefaultVendor(long id) {
        return new Vendor("No vendor retrieved :-(");
    }
}
