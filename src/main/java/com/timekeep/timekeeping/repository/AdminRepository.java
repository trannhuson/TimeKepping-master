package com.timekeep.timekeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timekeep.timekeeping.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
