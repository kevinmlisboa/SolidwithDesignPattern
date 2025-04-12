public class InternetAccess implements Resource {
    @Override
    public void borrow(String borrowerName, String title) {
        System.out.println(borrowerName + " is accessing " + title + " through the internet.");
    }
}
