package com.tribepay.mvcapp.springdata;

import com.tribepay.mvcapp.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchSpringRepo extends JpaRepository<Branch,Long> {
}
