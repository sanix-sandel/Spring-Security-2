package com.sanix.SpringSecurity2.Student;

public class Student {

    private final Integer studentId;
    private final String lastName;

    public Student(Integer studentId, String lastName) {
        this.studentId = studentId;
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getLastName() {
        return lastName;
    }
}
