package com.erp.repositories;

import com.erp.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    public Admin findBySnuId(String snuId);

    public Admin findByNetId(String netId);
}
