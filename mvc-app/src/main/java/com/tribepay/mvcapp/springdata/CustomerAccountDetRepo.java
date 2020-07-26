package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.CustomerAccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerAccountDetRepo extends JpaRepository<CustomerAccountDetail,Long> {

    Optional<CustomerAccountDetail> findByCustomerId(Long CustomerId);
}
