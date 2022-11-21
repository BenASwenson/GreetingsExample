package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FilmClassificationsTest {


    @Test
    @DisplayName("Given an age of 4, availableClassifications returns U Films are available")
    public void GivenAnAgeOf4_returnsUFilmsAvailable() {
        int age = 4;
        // arrange
        String expected = "U films are available.";
        // act
        String result = FilmClassifications.availableClassifications(4);
        // assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an age of 3, availableClassifications returns You are too young to view U, PG, 12, 12A, 15 & 18 films")
    public void GivenAnAgeOf3_returnsYouAreTooYoung() {
        int age = 3;
        // arrange
        String expected = "You are too young to view U, PG, 12, 12A, 15 & 18 films.";
        // act
        String result = FilmClassifications.availableClassifications(3);
        // assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7})
    @DisplayName("Given ages between 4 and 7 inclusive, returns U films are available")
    public void givenAgeBetween4and7inclusiveReturnsUFilms(int age) {
        String expected = "U films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {8,9,10,11})
    @DisplayName("Given ages between 8 and 11 inclusive, returns U & PG films are available")
    public void givenAgeBetween8and11inclusiveReturnsUPGFilms(int age) {
        String expected = "U & PG films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("Given ages between 12 and 14 inclusive, returns U, PG, 12 & 12A films are available.")
    public void givenAgeBetween12and14InclusiveReturnsUPG1212AFilms(int age) {
        String expected = "U, PG, 12 & 12A films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Given ages between 15 and 17 inclusive, returns U, PG, 12, 12A & 15 films are available.")
    public void givenAgeBetween15and17InclusiveReturnsUPG1212A15Films(int age) {
        String expected = "U, PG, 12, 12A & 15 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,20})
    @DisplayName("Given ages 18 and over, returns U, PG, 12, 12A, 15 & 18 films are available.")
    public void givenAge18andOverReturnsUPG1212A1518Films(int age) {
        String expected = "U, PG, 12, 12A, 15 & 18 films are available.";
        String result = FilmClassifications.availableClassifications(age);
        assertEquals(expected, result);
    }



}
