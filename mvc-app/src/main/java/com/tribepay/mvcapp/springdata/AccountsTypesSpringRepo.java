package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.AccountTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsTypesSpringRepo extends JpaRepository<AccountTypes,Long> {
}
