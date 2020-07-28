package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankSpringDataRepository extends JpaRepository<Bank,Long> {
    @Query(value = "Select * from bank where bank_id=:bank_id",nativeQuery = true)
    Bank findByBank_id(@Param("bank_id")Long bank_id);
}
