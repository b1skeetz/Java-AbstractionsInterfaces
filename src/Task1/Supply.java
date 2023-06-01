package Task1;

public class Supply implements ISuppliable {
    @Override
    public void delivery(String[] books, Admin admin) {
        admin.setBooks(books);
        System.out.println("Поставка завершена");
    }
}