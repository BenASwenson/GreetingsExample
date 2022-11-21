package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("My first test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, greeting returns Good evening!")
    public void givenATime21_Greeting_ReturnsGoodEvening() {
        int time = 21;
        // Arrange
        String expectedGreeting = "Good evening!";
        // Act
        String result = Main.greeting(time);
        // Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given a time of 7, greeting returns Good morning!")
    public void givenATime7_Greeting_ReturnsGoodMorning() {
        int time = 7;
        // Arrange
        String expectedGreeting = "Good morning!";
        // Act
        String result = Main.greeting(7);
        // Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given a time of 13, greeting returns Good afternoon!")
    public void givenATime13_Greeting_ReturnsGoodAfternoon() {
        int time = 13;
        // Arrange
        String expectedGreeting = "Good afternoon!";
        // Act
        String result = Main.greeting(13);
        // Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Given a time between 5 and 12, greeting returns Good morning")
    public void givenATimeBetween5and12_Greeting_ReturnsGoodMorning(int time) {
        String expectedGreeting = "Good morning!";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 16, 18})
    @DisplayName("Given a time between 13 and 18, greeting returns Good afternoon!")
    public void givenATimeBetween13and18_Greeting_ReturnsGoodAfternoon(int time) {
        // Arrange
        String expectedString = "Good afternoon!";
        // Act
        String result = Main.greeting(time);
        // Assert
        assertEquals(expectedString, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 24, 4})
    @DisplayName("Given a time between 19 and 4, greeting returns Good evening!")
    public void givenATimeBetween19and4_Greeting_ReturnsGoodEvening(int time) {
        // Arrange
        String expectedString = "Good evening!";
        // Act
        String result = Main.greeting(time);
        // Assert
        assertEquals(expectedString, result);
    }


}