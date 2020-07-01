package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataRepository extends JpaRepository<User,Integer> {

    User findByName(String name);
    


}




