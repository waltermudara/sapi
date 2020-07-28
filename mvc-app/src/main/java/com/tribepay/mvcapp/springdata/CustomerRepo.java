package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    /**
    @Query(value="select * from customer order by dob desc limit 1",nativeQuery = true)
    Customer findRecent;
    **/
    @Query(value="Select * from customer where customer_id=:customer_id",nativeQuery = true)
    Customer findByCustomer_id(@Param("customer_id") Long customerId);

    @Query(value="Select * from customer where msisdn=:msisdn",nativeQuery = true)
    Customer findByMsisdn(@Param("msisdn") String msisdn);





}
