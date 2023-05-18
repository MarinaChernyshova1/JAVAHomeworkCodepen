package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addFourFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilms("Matrix");
        manager.addFilms("Resident Evil");
        manager.addFilms("Shrek");
        manager.addFilms("Day after tomorrow");


        String[] expected = {"Matrix", "Resident Evil", "Shrek", "Day after tomorrow"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullFilmsTest() {
        FilmManager manager = new FilmManager();


        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilmTest() {
        FilmManager manager = new FilmManager();

        manager.addFilms("Matrix");

        String[] expected = {"Matrix"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFindLastTest (){
        FilmManager manager = new FilmManager();

        manager.addFilms("Matrix");
        manager.addFilms("Resident Evil");
        manager.addFilms("Shrek");
        manager.addFilms("Day after tomorrow");
        manager.addFilms("Titanic");
        manager.addFilms("Bond");


        String[] expected = {"Bond", "Titanic", "Day after tomorrow", "Shrek","Resident Evil"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    public void showFindLastWhenThreeFilmsInPoster (){
        FilmManager manager = new FilmManager();


        manager.addFilms("Day after tomorrow");
        manager.addFilms("Titanic");
        manager.addFilms("Bond");


        String[] expected = {"Bond", "Titanic", "Day after tomorrow"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals (expected, actual);
    }
    @Test
    public void showFindLastWhenSetLimitFilmsInPoster (){
        FilmManager manager = new FilmManager(6);


        manager.addFilms("Day after tomorrow");
        manager.addFilms("Titanic");
        manager.addFilms("Bond");
        manager.addFilms("Matrix");
        manager.addFilms("Resident Evil");
        manager.addFilms("Shrek");
        manager.addFilms("Man in black");
        manager.addFilms("Man in black 2");


        String[] expected = {"Man in black 2", "Man in black", "Shrek", "Resident Evil", "Matrix", "Bond"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals (expected, actual);
    }



}
