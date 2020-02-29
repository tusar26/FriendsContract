package com.example.friendscontract;

public class Student {

    String [] name,location;

    public Student(String[] name, String[] location, String[] number, int[] profile_image) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.profile_image = profile_image;
    }

    String[] number;
    int[] profile_image;

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String[] getNumber() {
        return number;
    }

    public void setNumber(String[] number) {
        this.number = number;
    }

    public int[] getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int[] profile_image) {
        this.profile_image = profile_image;
    }


}
