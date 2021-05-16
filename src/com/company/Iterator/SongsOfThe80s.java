package com.company.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{
    Song[] bestSongs;

    int arrayValue = 0;

    public SongsOfThe80s() {

        bestSongs = new Song[3];

        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }

    private void addSong(String songName, String bandName, int yearReleased){

        Song song = new Song(songName, null, yearReleased, bandName, null);

        bestSongs[arrayValue] = song;

        arrayValue++;

    }

    public Song[] getBestSongs(){

        return bestSongs;

    }

    @Override
    public Iterator<Song> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }

    @Override
    public String getDescription() {
        return "Songs Of The 80s";
    }
}
