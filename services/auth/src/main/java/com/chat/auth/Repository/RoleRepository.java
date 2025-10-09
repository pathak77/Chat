package com.chat.auth.Repository;

import com.chat.auth.Entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<RolesEntity ,Long> {
    Optional<RolesEntity> findByName(String name);
}
