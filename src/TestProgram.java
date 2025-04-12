public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Kevin");

        Resource book = new Book();
        Resource journal = new Journal();
        Resource newspaper = new Newspaper();
        Resource thesis = new Thesis();
        Resource capstone = new Capstone();
        Resource internet = new InternetAccess();

        student.borrowResource(book, "Java Programming");
        student.borrowResource(journal, "IEEE Research 2024");
        student.borrowResource(newspaper, "The Boston Globe");
        student.borrowResource(thesis, "AI in Healthcare");
        student.borrowResource(capstone, "NEU Capstone Project");
        student.borrowResource(internet, "NEU Library Portal");
    }
}
