package model;

public class Library {


    private static final int MAX_PUBLICATIONS = 2000;
    private int numerOfPublications = 0;
    Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[numerOfPublications];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
    addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
    addPublication(magazine);
    }
    private void addPublication(Publication publication) {
        if (numerOfPublications >= MAX_PUBLICATIONS)
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji została osiągnięta " + MAX_PUBLICATIONS);
        publications[numerOfPublications] = publication;
        numerOfPublications++;
    }
}
