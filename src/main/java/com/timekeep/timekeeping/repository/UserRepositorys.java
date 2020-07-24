package com.timekeep.timekeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timekeep.timekeeping.entity.User;

@Repository
public interface UserRepositorys extends JpaRepository<User, Long>{

}
