package com.example.hackathon_1.finalUser.domain;

import static org.junit.jupiter.api.Assertions.assertNull;

import com.example.hackathon_1.user.domain.Role;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class FinalUserTest {
    private FinalUser finalUser;

    public void setUpFinalUser() {
        finalUser = new FinalUser();
        finalUser.setFirstName("Joaquin");
        finalUser.setLastName("Lopez");
        finalUser.setRole(Role.ROLE_USER);
    }

    @BeforeEach
    void setUp() {
        setUpFinalUser();
    }

    @Test
    void testFinalUserCreation() {
        Assertions.assertNotNull(finalUser);
        Assertions.assertEquals(Role.ROLE_USER, finalUser.getRole());
        Assertions.assertEquals("Joaquin", finalUser.getFirstName());
        Assertions.assertEquals("Lopez", finalUser.getLastName());
    }

    @Test
    void testFinalUserNull() {
        finalUser = null;
        assertNull(finalUser);
    }
};
