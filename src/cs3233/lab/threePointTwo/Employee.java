package cs3233.lab.threePointTwo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee implements Comparable<Employee> {
    private int age;
    private Name name;
    private Date empDate;

    public Employee(String firstName, String lastName, int age, Date d)
    {
        name = new Name(firstName, lastName);
        this.age= age;
        empDate = d;
    }

    public Date hireDate() {
        return empDate;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }


    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date = df.format(empDate); // Converting date in "dd/MM/yyyy" format
        return name.firstName() + " "+ name.lastName()+ " Age: " + age	+ " , hire date:"+ date;
    }

    //write code for the compareTo() method here. You are to compare the age of the employees
    public int compareTo(Employee e) {
        if (this.age > e.age) {
            return 1;
        } else if (this.age < e.age) {
            return -1;
        } else {
            return 0;
        }
    }
}