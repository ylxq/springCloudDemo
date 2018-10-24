package com.example.ssecurity.security.repository;

import com.example.ssecurity.security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tao
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}