package com.group.commute.Domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, String> {
    long countByName(String teamName);
    Optional<Team> findByName(String teamName);
    void deleteByName(String teamName);
}
