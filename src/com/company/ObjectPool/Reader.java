package com.company.ObjectPool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private String identifier;
    private BufferedReader reader;

    public Reader() {
    }

    public Reader(String identifier, String archivePath) {
        this.identifier = identifier;
        try {
            this.reader = new BufferedReader(new FileReader(new File(archivePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedReader getReader() {
        return reader;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void readArchive() throws IOException {
        System.out.println("Starting read of archive with the " + this.identifier);
        while (reader.ready()) {
            System.out.println(reader.readLine());
        }
    }

    @Override
    public String toString() {
        return "The reader " + this.identifier + " is being used";
    }
}
