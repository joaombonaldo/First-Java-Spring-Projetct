package com.jm.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jm.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}
