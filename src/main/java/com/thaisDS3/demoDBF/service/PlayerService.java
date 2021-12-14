package com.thaisDS3.demoDBF.service;

import com.thaisDS3.demoDBF.domain.Player;
import com.thaisDS3.demoDBF.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final Logger log = LoggerFactory.getLogger(PlayerService.class);

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAllList(){
        log.debug("Request to get All Player");
        return playerRepository.findAll();
    }

    public Optional<Player> findOne(Long id) {
        log.debug("Request to get Player : {}", id);
        return playerRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Player : {}", id);
        playerRepository.deleteById(id);
    }

    public Player save(Player player) {
        log.debug("Request to save Player : {}", player);
        player = playerRepository.save(player);
        return player;
    }

    public List<Player> saveAll(List<Player> players) {
        log.debug("Request to save Player : {}", players);
        players = playerRepository.saveAll(players);
        return players;
    }
}
