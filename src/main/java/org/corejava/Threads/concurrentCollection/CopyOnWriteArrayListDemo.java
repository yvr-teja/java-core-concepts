package org.corejava.Threads.concurrentCollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Start two writers and one reader
        Thread writer1 = new WriterThread(list, "Writer1");
        Thread writer2 = new WriterThread(list, "Writer2");
        Thread reader = new ReaderThread(list);

        writer1.start();
        writer2.start();
        reader.start();
    }
}
class WriterThread extends Thread {
    private CopyOnWriteArrayList<String> list;
    private String name;

    public WriterThread(CopyOnWriteArrayList<String> list, String name) {
        this.list = list;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String item = name + "-Item" + i;
            list.add(item);
            System.out.println(name + " added: " + item);

            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReaderThread extends Thread {
    private CopyOnWriteArrayList<String> list;

    public ReaderThread(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Reader sees: " + list);
            try {
                Thread.sleep(150); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}