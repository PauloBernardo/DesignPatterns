package com.company.Iterator;

public class Song {

    private String name;
    private String author;
    private String bandName;
    private String singerName;
    private int yearReleased;

    public Song(String name, String author, int yearReleased) {
        this.name = name;

        this.author = author;
        this.yearReleased = yearReleased;
    }

    public Song(String name, String author, int yearReleased, String bandName, String singerName) {
        this.name = name;
        this.author = author;
        this.yearReleased = yearReleased;
        this.bandName = bandName;
        this.singerName = singerName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
}
