package Task1;

import java.util.Objects;

public class UserSY {
    private String name ;
    private String surName ;
    private int age ;
    private int hieght ;

    public UserSY(String name, String surName, int age, int hieght) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.hieght = hieght;
    }

    @Override
    public String toString() {
        return "UserSY{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", hieght=" + hieght +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSY userSY = (UserSY) o;
        return age == userSY.age && hieght == userSY.hieght && name.equals(userSY.name) && surName.equals(userSY.surName);
    }

    /**
     * Здесь я решил создать свою формулу для hashcoda))
     *
     * @return
     */

    @Override
    public int hashCode() {
        return 17 * ((17 * age) + (2 * hieght)) + (Objects.hash(name, surName, age, hieght) * 0);
    }
}
