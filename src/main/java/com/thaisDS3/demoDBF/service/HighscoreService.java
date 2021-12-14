package com.thaisDS3.demoDBF.service;

import com.thaisDS3.demoDBF.domain.Highscore;
import com.thaisDS3.demoDBF.repository.HighscoreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class HighscoreService {
    private final Logger log = LoggerFactory.getLogger(HighscoreService.class);

    private final HighscoreRepository highscoreRepository;

    public HighscoreService(HighscoreRepository highscoreRepository) {
        this.highscoreRepository = highscoreRepository;
    }

    public List<Highscore> findAllList(){
        log.debug("Request to get All Highscore");
        return highscoreRepository.findAll();
    }

    public Optional<Highscore> findOne(Long id) {
        log.debug("Request to get Highscore : {}", id);
        return highscoreRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Highscore : {}", id);
        highscoreRepository.deleteById(id);
    }

    public Highscore save(Highscore highscore) {
        log.debug("Request to save Highscore : {}", highscore);
        highscore = highscoreRepository.save(highscore);
        return highscore;
    }

    public List<Highscore> saveAll(List<Highscore> highscores) {
        log.debug("Request to save Highscore : {}", highscores);
        highscores = highscoreRepository.saveAll(highscores);
        return highscores;
    }
}
