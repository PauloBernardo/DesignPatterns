package com.company.Iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    Hashtable<Integer, Song> bestSongs = new Hashtable<>();

    int hashKey = 0;

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);

    }

    public void addSong(String songName, String bandName, int yearReleased){

        Song songInfo = new Song(songName, null, yearReleased, bandName, null);

        bestSongs.put(hashKey, songInfo);

        hashKey++;

    }

    public Hashtable<Integer, Song> getBestSongs(){

        return bestSongs;

    }

    @Override
    public Iterator<Song> createIterator() {
        return bestSongs.values().iterator();
    }

    @Override
    public String getDescription() {
        return "Songs Of The 90s";
    }
}
