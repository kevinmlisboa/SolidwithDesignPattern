public class Journal implements Resource {
    @Override
    public void borrow(String borrowerName, String title) {
        System.out.println(borrowerName + " is borrowing a journal called " + title);
    }
}
