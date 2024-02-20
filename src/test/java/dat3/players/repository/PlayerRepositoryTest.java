package dat3.players.repository;

import dat3.players.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepositoryTest {

    @Autowired
    PlayerRepository playerRepository;
    @BeforeEach
    void setUp() {
        playerRepository.save(new Player("xx1", "yy1", "zz1"));
        playerRepository.save(new Player("xx2", "yy2", "zz2"));
    }

    @Test
    public void testAllPlayers(){
        assertEquals(2,playerRepository.count());
    }
    @Test
    public void testAddPlayer(){
        Player pNew = new Player("xx3", "yy3", "zz3");
        System.out.println(pNew);
        playerRepository.save(pNew);
        assertTrue(pNew.getId()>0);
    }

    public void allwaysFail(){
        assertTrue(false);
    }
    }

    //this is an always fail test