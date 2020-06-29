package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankSpringDataRepository extends JpaRepository<Bank,Integer> {
}
