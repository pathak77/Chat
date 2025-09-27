package com.chat.auth.Repository;

import com.chat.auth.Entity.authEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<authEntity, Long> {

}
