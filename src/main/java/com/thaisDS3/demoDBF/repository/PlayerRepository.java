package com.thaisDS3.demoDBF.repository;

import com.thaisDS3.demoDBF.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, JpaSpecificationExecutor<Player> {
    Optional<Player> findByNickname(String nickname);

    @Query(value = "Select * from table_player", nativeQuery = true)
    List<Player> mostrarTodoMundoSqlNativo();

    @Query("select distinct p from Player p")
    List<Player> mostrarTodoMundoJpql();

}
