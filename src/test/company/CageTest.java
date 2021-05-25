package company;


import com.company.Cage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CageTest {
    Cage cage = new Cage();

    @DisplayName("Testing the dragon name")
    @Test
    void cage1() {
        assertEquals("Leo", cage.getDragonName(), "test 1  failed!");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Completed the test");
    }

}