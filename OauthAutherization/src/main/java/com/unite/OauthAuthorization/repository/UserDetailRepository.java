package com.unite.OauthAuthorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unite.OauthAuthorization.model.User;
import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}
