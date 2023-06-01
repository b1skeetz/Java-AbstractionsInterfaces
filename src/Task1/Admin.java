package Task1;

import java.util.Arrays;

public class Admin implements IAdminable {
    private String[] books;

    public Admin(String[] books) {
        this.books = books;
    }

    public String[] getBooks() {
        return books;
    }

    public String booksToString() {
        return Arrays.toString(books);
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public void searchAndGive(Reader reader) {
        for (String book : books) {
            if (reader.getBooksName().equals(book) && reader.isHasGotBook() == false) {
                reader.setHasGotBook(true);
                System.out.println("Статус получения книги:" + reader.isHasGotBook() + ". Книга под названием " + book + " Успешно выдана");
            }
        }
        if (reader.isHasGotBook() == false) {
            System.out.println("Книга либо выдана, либо такой книги нет!");
        }
    }

    @Override
    public boolean notify(Reader reader) {
        if (reader.isExpired()) {
            System.out.println("Книга просрочена! Верните ее пожалуйста в ближайшее время");
            return true;
        }
        System.out.println("Время еще есть, можете не переживать. Читайте на здоровье!");
        return false;
    }
}