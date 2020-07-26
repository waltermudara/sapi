package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.CurrencyTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyTypeRepo extends JpaRepository<CurrencyTypes,Long> {
}
