package com.ip.myrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ip.myrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
