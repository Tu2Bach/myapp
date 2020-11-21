package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User getFirstByUserName(String userName);
}
