package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsSpringRepository extends JpaRepository<Accounts,Long> {

}
