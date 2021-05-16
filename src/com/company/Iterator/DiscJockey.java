package com.company.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DiscJockey {

    ArrayList<SongIterator> songIterators;

    public DiscJockey() {
        songIterators = new ArrayList<>();
    }

    public DiscJockey(SongIterator song70s, SongIterator song80s, SongIterator song90s) {
        songIterators = new ArrayList<>();
        songIterators.add(song70s);
        songIterators.add(song80s);
        songIterators.add(song90s);
    }

    public void addSongIterator(SongIterator songIterator) {
        songIterators.add(songIterator);
    }

    public void showTheSongs(){

        for(SongIterator songs: songIterators) {
            System.out.println(songs.getDescription());
            printTheSongs(songs.createIterator());
        }

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            Song song = (Song) iterator.next();

            System.out.println(song.getName() +" - " + song.getBandName() + " - " + song.getYearReleased());

        }
        System.out.println();

    }

}
