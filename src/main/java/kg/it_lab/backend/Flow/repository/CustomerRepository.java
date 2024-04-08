package kg.it_lab.backend.Flow.repository;

import kg.it_lab.backend.Flow.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

   // @Query(value = "select * from customers c where c.name=:name", nativeQuery = true)
    Customer findCustomerByName(String name);
}
