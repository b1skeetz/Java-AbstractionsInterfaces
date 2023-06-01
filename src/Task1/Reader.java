package Task1;

public class Reader implements IReadable {
    private String name;
    private String bookName;
    private boolean hasGotBook = false;
    private boolean isExpired;

    public Reader(String name, String bookName, int days) {
        this.name = name;
        this.bookName = bookName;
        if (days > 7) {
            this.isExpired = true;
        } else if (days <= 7) {
            this.isExpired = false;
        }
    }

    public boolean isHasGotBook() {
        return hasGotBook;
    }

    public void setHasGotBook(boolean hasGotBook) {
        this.hasGotBook = hasGotBook;
    }

    public Reader(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooksName() {
        return bookName;
    }

    public void setBooksName(String booksName) {
        this.bookName = bookName;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    @Override
    public void takeBook(Admin admin) {
        admin.searchAndGive(this);
        System.out.println("Ура, я получил книгу!");
    }

    @Override
    public void returnBook(Admin admin) {
        if (admin.notify(this) && isHasGotBook() == true) {
            System.out.println("Книга возвращена!");
            setHasGotBook(false);
            setExpired(false);
        } else {
            System.out.println("Такой книги у меня нет или срок еще не истек!");
        }
    }
}