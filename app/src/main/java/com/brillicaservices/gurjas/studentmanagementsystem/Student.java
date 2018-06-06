package com.brillicaservices.gurjas.studentmanagementsystem;

/*
* @author Gurjas Singh
* Brillica Services, Dehradun
* 7/May/2018*/

/*
* Creating Student class to store the data into
* ArrayList*/
public class Student {

    /*
    * Creating different class variable that would
    * get the value of each and every object*/

    String studentName;
    String studentCollege;
    int studentPhoneNumber;
    String studentAddress;

    /*
    * Creating a constructor in which we will pass the respective data i.e.
    * studentName, studentCollege, studentPhoneNumber, studentAddress*/

    public Student(String studentName, String studentCollege, int studentPhoneNumber,
                   String studentAddress) {
        this.studentName = studentName;
        this.studentCollege = studentCollege;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentAddress = studentAddress;
    }

    /*
    * Creating a getter setter method.*/

    public int getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentPhoneNumber(int studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

}
