public class Book implements Resource {
    @Override
    public void borrow(String borrowerName, String title) {
        System.out.println(borrowerName + " is borrowing a book called " + title);
    }
}
