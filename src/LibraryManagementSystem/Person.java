package LibraryManagementSystem;

import javax.management.relation.Role;

public class Person implements Comparable<Person>{

    private String name;
    private String role;
    private int level;
    private String request;

    public Person(String name, String role, int level, String request) {
        this.name = name;

        Roles roles;
        roles = Roles.valueOf(role.toUpperCase());
        switch (roles){
            case LIBRARIAN:
                this.role = "Librarian";
                break;
            case TEACHER:
                this.role = "Teacher";
                break;
            case STUDENT:
                this.role = "Student";
                break;
        }
        this.role = role;
        this.level = level;
        this.request = request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public int compareTo(Person o) {
        if(this.level < o.level || this.level == o.level) return  1;
        else return -1;
    }
}
