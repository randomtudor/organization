package Organization;

public class Employee {
    private String name;
    private String age;
    private String sex;
    private String department;

    public Employee(String n, String a, String s, String d) {
        name = n;
        age = a;
        sex = s;
        department = d;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String n) {
        n = name;
    }

    public void setAge(String a) {
        age = a;
    }

    public void setSex(String s) {
        sex = s;
    }

    public void setDepartment(String d) {
        department = d;
    }

}