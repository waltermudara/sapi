package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccupationSpringRepo extends JpaRepository<Occupation,Long> {
}
