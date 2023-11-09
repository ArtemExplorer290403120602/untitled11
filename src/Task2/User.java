package Task2;

public class User implements Cloneable {
    private int age;
    private int hieght;
    private String name;
    private String surName;

    public User(int age, int hieght, String name, String surName) {
        this.age = age;
        this.hieght = hieght;
        this.name = name;
        this.surName = surName;
    }

    public User(Object clone) {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", hieght=" + hieght +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
