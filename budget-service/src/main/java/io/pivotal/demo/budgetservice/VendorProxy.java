package io.pivotal.demo.budgetservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "vendors")
public interface VendorProxy {
    @GetMapping("/vendors/{id}")
    Vendor getVendor(@PathVariable long id);
}
