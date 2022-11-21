package com.sparta;

public class FilmClassifications {

    public static void main(String[] args) {
        System.out.println(availableClassifications(17));
    }

    public static String availableClassifications(int ageOfViewer) {
        String result = "";
        if(ageOfViewer >= 4 && ageOfViewer < 8) {
            result = "U films are available.";
        } else if(ageOfViewer >= 8 && ageOfViewer < 12) {
            result = "U & PG films are available.";
        } else if (ageOfViewer >= 12 && ageOfViewer < 15) {
            result = "U, PG, 12 & 12A films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            result = "U, PG, 12, 12A & 15 films are available.";
        } else if (ageOfViewer >= 18) {
            result = "U, PG, 12, 12A, 15 & 18 films are available.";
        } else {
            result = "You are too young to view U, PG, 12, 12A, 15 & 18 films.";
        }

        return result;
    }
}
