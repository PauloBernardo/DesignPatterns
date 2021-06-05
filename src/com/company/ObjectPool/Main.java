package com.company.ObjectPool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Object Pool");

        try {
            ReaderPool pool = ReaderPool.getInstance();

            Reader readerX = pool.checkOut();
            readerX.readArchive();

            Reader readerY = pool.checkOut();
            System.out.println(readerY.toString());

            pool.checkIn(readerY);
            pool.checkIn(readerX);

            Reader readerZ = pool.checkOut();
            readerZ.readArchive();

            readerX = pool.checkOut();
            readerX.readArchive();

            pool.checkIn(readerX);

            pool.listBlocked();
            pool.listUnblocked();

            pool.checkIn(readerZ);

            readerX = pool.checkOut();
            readerY = pool.checkOut();
            readerZ = pool.checkOut();
            Reader readerW = pool.checkOut();

            if (readerW == null) System.out.println("Reader W can't be used!");
            pool.checkIn(readerX);

            readerW = pool.checkOut();
            if (readerW != null) System.out.println("Reader W can be used!");

            pool.checkIn(readerY);
            pool.checkIn(readerZ);
            pool.checkIn(readerW);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
