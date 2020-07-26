package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitySpringRepo extends JpaRepository<City,Long> {
}
