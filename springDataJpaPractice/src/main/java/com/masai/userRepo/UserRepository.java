package com.masai.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
