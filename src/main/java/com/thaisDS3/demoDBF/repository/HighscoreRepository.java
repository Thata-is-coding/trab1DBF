package com.thaisDS3.demoDBF.repository;

import com.thaisDS3.demoDBF.domain.Highscore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighscoreRepository extends JpaRepository<Highscore, Long> {
}
