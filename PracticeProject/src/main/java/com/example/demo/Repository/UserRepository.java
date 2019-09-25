package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
