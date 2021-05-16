package com.company.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    ArrayList<Song> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased){

        Song songInfo = new Song(songName, null, yearReleased, bandName, null);

        bestSongs.add(songInfo);

    }

    public ArrayList<Song> getBestSongs(){

        return bestSongs;

    }

    @Override
    public Iterator<Song> createIterator() {
        return bestSongs.iterator();
    }

    @Override
    public String getDescription() {
        return "Songs Of The 70s";
    }
}
