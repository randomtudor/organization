package Organization;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Organization {
    public static List<Employee> employees = new ArrayList<>();

    public Organization() {
        employees.add(new Employee("mirela", "23", "f", "design"));
    }

    public static void addEmployee() throws IOException {
        Map<String, String> map = inputValues();
        employees.add(new Employee(map.get("name"), map.get("age"), map.get("sex"), map.get("department")));
    }

    public static void getEmployee(String name) {
        for (Employee val : employees)
            if (val.getName().equals(name)) {
                System.out.println("name: " + val.getName());
                System.out.println("age: " + val.getAge());
                System.out.println("sex: " + val.getSex());
                System.out.println("department: " + val.getDepartment());
            }

        System.out.println();
    }

    public static void removeEmployee(String name) {
        //employees.removeIf(employee -> employee.getName().equals(name));
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee val = itr.next();

            if (val.getName().equals(name)) {
                itr.remove();
                break;
            }
        }
    }

    public static void removeEmployee(int age) {
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee val = itr.next();

            if (val.getAge().equals(age)){
                itr.remove();
                break;
            }
        }
    }

    public static void updateEmployee(String name) throws IOException {
        Map<String, String> map = inputValues();

        for (Employee val : employees) {
            if (val.getName().equals(name)) {
                val.setName(map.get("name"));
                val.setAge(map.get("age"));
                val.setSex(map.get("sex"));
                val.setDepartment(map.get("department"));

                break;
            }
        }
    }

    public static void showEmployees() {
        if (employees.isEmpty())
            System.out.println("list is empty");

        for (Employee val : employees) {
            System.out.println(val.getName());
            System.out.println(val.getAge());
            System.out.println(val.getSex());
            System.out.println(val.getDepartment());
            System.out.println();
        }
    }

    public static Map inputValues() throws IOException {
        Map<String, String> map = new HashMap<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        map.put("name", in.readLine());

        System.out.println("Enter sex: ");
        map.put("sex", in.readLine());

        System.out.println("Enter department: ");
        map.put("department", in.readLine());

        System.out.println("Enter age: ");
        map.put("age", in.readLine());

        return map;
    }
}
