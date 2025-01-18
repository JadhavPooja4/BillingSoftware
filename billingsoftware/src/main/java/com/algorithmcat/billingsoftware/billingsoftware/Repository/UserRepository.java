package com.algorithmcat.billingsoftware.billingsoftware.Repository;

import com.algorithmcat.billingsoftware.billingsoftware.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {


    User findByUsername(String username);
}
