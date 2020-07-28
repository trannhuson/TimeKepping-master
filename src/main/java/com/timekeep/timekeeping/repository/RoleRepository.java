package com.timekeep.timekeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timekeep.timekeeping.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findFirstByName(String role);

    Optional<Role> findByNameContaining(String name);
}
