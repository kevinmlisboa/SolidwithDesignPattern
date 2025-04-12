public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(Resource resource, String title) {
        resource.borrow(name, title);
    }
}
