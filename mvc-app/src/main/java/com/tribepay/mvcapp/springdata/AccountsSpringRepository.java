package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountsSpringRepository extends JpaRepository<Accounts,Long> {

    @Query(value ="select * from accounts where account_number=:account_number ", nativeQuery = true)
    Accounts findByAccountNumber(@Param("account_number") Long account_number);

    @Query(value="Select * from accounts where account_name=:account_name",nativeQuery = true)
    Accounts findByAccount_name(@Param("account_name") String account_name);

    @Query(value="Select * from accounts where customer_id=:customer_id",nativeQuery = true)
    Accounts findByCustomer_id(@Param("customer_id") Long customer_id);

}
