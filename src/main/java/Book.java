class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    Book(String bookTitle, String bookAuthor, int bookRelease,
         int bookPages, String bookPublisher, String bookIsbn) {
        this(bookTitle, bookAuthor, bookRelease, bookPages, bookPublisher);
        this.isbn = bookIsbn;
    }

    Book(String bookTitle, String bookAuthor, int bookRelease,
         int bookPages, String bookPublisher) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookRelease;
        pages = bookPages;
        publisher = bookPublisher;
    }


    void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}