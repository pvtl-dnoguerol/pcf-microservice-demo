package io.pivotal.demo.vendorservice;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface VendorRepository extends PagingAndSortingRepository<Vendor,Long> {
}
