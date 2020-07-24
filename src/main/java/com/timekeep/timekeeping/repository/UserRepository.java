package com.timekeep.timekeeping.repository;

import com.timekeep.timekeeping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
<<<<<<< HEAD
=======
	User findFistByCode (Long ids);
>>>>>>> add files
}
