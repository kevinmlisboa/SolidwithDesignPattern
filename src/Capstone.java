public class Capstone implements Resource {
    @Override
    public void borrow(String borrowerName, String title) {
        System.out.println(borrowerName + " is borrowing a capstone called " + title);
    }
}
