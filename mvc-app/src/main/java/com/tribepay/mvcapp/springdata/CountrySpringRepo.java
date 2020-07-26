package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountrySpringRepo extends JpaRepository<Country,Long> {
}
