package io;

import model.Book;
import model.Magazine;
import model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int bookCounter = 0;
        for (int i = 0; i < numerOfPublications; i++) {
            if (publications[i] instanceof Book) {
                System.out.println(publications[i]);
                bookCounter++;
            }
        }
        if (bookCounter == 0) {
            printLine("brak książek w bibliotece");
        }
    }

    public void printMagazines(Publication[] publications) {
        int magazinesCounter = 0;
        for (int i = 0; i < numerOfPublications; i++) {
            if (publications[i] instanceof Magazine) {
                System.out.println(publications[i]);
                magazinesCounter++;
            }
            if (magazinesCounter == 0) {
                printLine("brak magazynów w bibliotece");
            }
        }
    }
    public void printLine(String text) {
        System.out.println(text);
    }
}
