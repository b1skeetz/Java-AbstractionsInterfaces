package Task1;

public class Main {
    public static void main(String[] args) {
        String[] adminBooks = new String[] {"Book3", "Book1", "Book2"};
        String[] newBooks = new String[] {"Book4", "Book5", "Book6", "Book7"};
        Reader reader = new Reader("Damir", "Book1", 9);
        Admin admin = new Admin(adminBooks);
        Librarian librarian = new Librarian(newBooks, admin);
        Supply supplier = new Supply();
        reader.takeBook(admin);
        if(admin.notify(reader) == true){
            reader.returnBook(admin);
        }
        librarian.order(supplier, admin);
        System.out.println(admin.booksToString());
    }
}
