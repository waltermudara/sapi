package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataRepository extends JpaRepository<Users,Integer> {
    Users findUsersByName(String name);


}
