package tosinRepo;

public class Student {
    private String firstname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        this.firstname = "Unknown";
        this.age = 0;
    }


}
