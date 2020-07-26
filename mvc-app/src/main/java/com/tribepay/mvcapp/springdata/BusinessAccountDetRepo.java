package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Business_AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessAccountDetRepo extends JpaRepository<Business_AccountDetail,Long> {
}
