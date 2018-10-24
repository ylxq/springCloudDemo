package com.example.oauthcenter.oauthcenterdemo.repository;

import com.example.oauthcenter.oauthcenterdemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}