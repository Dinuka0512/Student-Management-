/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement.edu.ijse.dto;

/**
 *
 * @author dinuka
 */
public class StudentDto {
    private String studentID;
    private String name;
    private String address;
    private int grade;
    
    public StudentDto() {
    }

    public StudentDto(String studentID, String name, String address, int grade) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentDto{" + "studentID=" + studentID + ", name=" + name + ", address=" + address + ", grade=" + grade + '}';
    }
}
