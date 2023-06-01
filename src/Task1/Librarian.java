package Task1;

public class Librarian implements IOrderable{
    private String[] books;

    public Librarian(String[] books, Admin admin) {
        String[] buf = new String[books.length + admin.getBooks().length];
        for(int i = 0; i < admin.getBooks().length; i++){
            buf[i] = admin.getBooks()[i];
        }
        for(int i = admin.getBooks().length, j = 0; i < buf.length && j < books.length; i++, j++){
            buf[i] = books[j];
        }
        this.books = buf;
    }

    @Override
    public void order(Supply supplier, Admin admin) {
        supplier.delivery(books, admin);
    }
}
