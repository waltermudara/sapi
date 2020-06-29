package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<Users,Integer> {
}
