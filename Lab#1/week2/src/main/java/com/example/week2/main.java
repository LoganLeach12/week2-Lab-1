package com.example.week2;

import java.util.ArrayList;

 class Main {
    public static void main(String[] args) {
        ArrayList<String> activities = new ArrayList<>();
        activities.add("working out at gym");
        activities.add("gaming on computer");
        activities.add("pre cooking meals");
        activities.add("playing chess");
        activities.add("playing basketball");

        Student student = new Student("Logan", "Leach", 9945677, activities);
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Student number: " + student.getStudentNumber());
        System.out.println("Activities: " + student.getActivities());
    }
}

