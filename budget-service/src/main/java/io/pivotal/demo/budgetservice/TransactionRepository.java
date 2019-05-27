package io.pivotal.demo.budgetservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepository extends PagingAndSortingRepository<Transaction,Long> {
}
