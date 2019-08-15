package io.crf.base.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.crf.base.gateway.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
