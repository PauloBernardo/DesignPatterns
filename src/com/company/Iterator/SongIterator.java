package com.company.Iterator;

import java.util.Iterator;

public interface SongIterator {
    public Iterator<Song> createIterator();
    public String getDescription();
}
