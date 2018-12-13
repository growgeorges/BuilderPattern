package Tests;

import API.Name;
import Implementation.NameImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameImplTest {

    private Name nom1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        List<String> mesSurnoms = new ArrayList<>(Arrays.asList("toto", "tata"));
        nom1 = new NameImpl.Builder().setFirstName("Fa").setLastName("AUXIETRE").setMiddleNames(mesSurnoms).build();
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals(nom1.getFirstName(), "Fa");
    }

    @org.junit.jupiter.api.Test
    void getMiddleNames() {
        assertFalse(nom1.getMiddleNames().contains("Auxietre"));
        assertTrue(nom1.getMiddleNames().contains("toto"));
        assertTrue(nom1.getMiddleNames().contains("tata"));
        assertEquals(2, nom1.getMiddleNames().size());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertNotEquals("francois", nom1.getLastName());
        assertEquals("Auxietre".toUpperCase(), nom1.getLastName());

    }
}