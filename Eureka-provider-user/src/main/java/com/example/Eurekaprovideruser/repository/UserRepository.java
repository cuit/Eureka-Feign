package com.example.Eurekaprovideruser.repository;

import com.example.Eurekaprovideruser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by XSC on 2017/8/20.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
