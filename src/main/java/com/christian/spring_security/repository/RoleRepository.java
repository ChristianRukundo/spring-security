package com.christian.spring_security.repository;

import com.christian.spring_security.models.ERole;
import com.christian.spring_security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName (ERole name);
}
