package com.company.ObjectPool;

import java.util.ArrayList;

public class ReaderPool {
    private static ReaderPool readerPool = null;
    private final ArrayList<Reader> readersBlocked;
    private final ArrayList<Reader> readersUnblocked;
    private final int maxReaders = 3;

    private ReaderPool() {
        readersBlocked = new ArrayList<>();
        readersUnblocked = new ArrayList<>();
    }

    public void checkIn(Reader reader) {
        this.readersBlocked.remove(reader);
        this.readersUnblocked.add(reader);
        System.out.println("The reader " + reader.getIdentifier() + " was just returned");
    }

    public Reader checkOut() {
        if (this.readersUnblocked.size() == 0 && this.readersBlocked.size() == 0) {
            for (int i = 0; i < this.maxReaders; i++) {
                this.readersUnblocked.add(new Reader("Reader " + (i + 1), "/home/paulo/Documentos/Faculdade/DesignPatterns/src/com/company/ObjectPool/out.txt"));
            }
        }

        if (this.readersBlocked.size() < this.maxReaders) {
            Reader reader = this.readersUnblocked.iterator().next();
            this.readersUnblocked.remove(reader);
            this.readersBlocked.add(reader);
            System.out.println("The reader " + reader.getIdentifier() + " was just borrowed");
            return reader;
        } else {
            System.out.println("There was an error, pool is empty");
        }
        return null;
    }

    private Reader createReader() {
        if (this.readersBlocked.size() + this.readersUnblocked.size() < this.maxReaders) {
            Reader reader = new Reader("Reader " + readersUnblocked.size(), "/home/paulo/Documentos/Faculdade/DesignPatterns/src/com/company/ObjectPool/out.txt");
            readersBlocked.add(reader);
            return reader;
        } else {
            System.out.println("There was an error, pool is full!");
        }
        return null;
    }

    public static ReaderPool getInstance() {
        if (readerPool == null) {
            readerPool = new ReaderPool();
        }
        return readerPool;
    }

    public void listBlocked() {
        this.printList(this.readersBlocked, "Blocked Readers List");
    }

    public void listUnblocked() {
        this.printList(this.readersUnblocked, "Unblocked Readers List");
    }

    private void printList(ArrayList<Reader> list,String title) {
        System.out.println("\n" + title);
        for (Reader reader : list) {
            System.out.println(reader);
        }
        System.out.println();
    }
}
