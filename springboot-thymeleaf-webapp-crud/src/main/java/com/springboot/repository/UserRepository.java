package com.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;
import com.springboot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
