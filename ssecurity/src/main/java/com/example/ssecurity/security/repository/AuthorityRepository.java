package com.example.ssecurity.security.repository;

import com.example.ssecurity.security.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tao
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
