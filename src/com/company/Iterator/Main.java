package com.company.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Iterator");

        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        SongsOfThe2000s songs2000s = new SongsOfThe2000s();

        DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);
        madMike.addSongIterator(songs2000s);

        madMike.showTheSongs();
    }
}
