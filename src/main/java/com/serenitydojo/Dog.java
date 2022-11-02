package com.serenitydojo;

public class Dog {

    String name,favoriteToy;
    int age;
    public Dog(String name, String favoriteToy,int age) {
        this.age= age;
        this.favoriteToy=favoriteToy;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }
}
