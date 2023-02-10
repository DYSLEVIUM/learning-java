package org.classes;

// object class is the super class that all classes inherit from in java, so all classes have a equals and a hashcode method
public class Student {
    // no need to write static inside static block, as everything is static
    static {
        System.out.println("Initializer Code");
    }

    public String name;
    int age;
    String address;
    int rollNumber;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return ("Student name is: " + name + "\nStudent age is: " + age + "\nStudent address is: " + address);
    }

    // java maintains hashmap using both equals and hashcode
    @Override
    public int hashCode() {
//        return rollNumber;
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Student student = (Student) obj;
        return student.rollNumber == rollNumber;
    }

    public static void main(String[] args) {
        Student st = new Student(1, "Idk", 23, "India");
        System.out.println(st.getName());

        st.name = "Pushpa";
        System.out.println(st.getName());

        System.out.println(st);

        Student st2 = new Student(1, "Idkk", 23, "India");
        System.out.println(st.equals(st2));
    }
}
