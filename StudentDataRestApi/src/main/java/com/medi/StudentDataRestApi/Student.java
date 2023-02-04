package com.medi.StudentDataRestApi;

import jakarta.persistence.*;


@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(length = 64)
    private Integer stdId;
    private String firstName;
    private String lastName;
    private String faculty;
    private Float cgpa;


    protected Student(){}

    public Student(Integer stdId, String firstName, String lastName, String faculty, Float cgpa) {
        this.stdId = stdId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.cgpa = cgpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stdId=" + stdId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
