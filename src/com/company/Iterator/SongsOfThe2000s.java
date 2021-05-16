package com.company.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class SongsOfThe2000s implements SongIterator {
    LinkedList<Song> bestSongs;

    public SongsOfThe2000s() {

        bestSongs = new LinkedList<>();

        addSong("Hey Ya!", "Outkast", 2004);
        addSong("Single Ladies", "Beyoncé", 2008);
        addSong("Lose Yorself", "Eminem", 2002);

    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased){

        Song songInfo = new Song(songName, null, yearReleased, bandName, null);

        bestSongs.add(songInfo);

    }

    public LinkedList<Song> getBestSongs(){

        return bestSongs;

    }

    @Override
    public Iterator<Song> createIterator() {
        return bestSongs.iterator();
    }

    @Override
    public String getDescription() {
        return "Songs Of The 2000s";
    }
}
