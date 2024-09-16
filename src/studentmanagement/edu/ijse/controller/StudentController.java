/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement.edu.ijse.controller;
import java.sql.SQLException;
import java.util.List;
import studentmanagement.edu.ijse.model.StudentModel;
import studentmanagement.edu.ijse.dto.StudentDto;
/**
 *
 * @author dinuka
 */
public class StudentController {
    private StudentModel studentmodel = new StudentModel();
    
    public String saveStudentController(StudentDto dto) throws ClassNotFoundException, SQLException{
        String resp = studentmodel.saveStudentModel(dto);
        return resp;
    }
    
    public List<StudentDto> getAllstudents() throws ClassNotFoundException, SQLException{
        List<StudentDto> dtos = studentmodel.getAllStudents();
        return dtos;
    }
    
    public StudentDto searchStudentsController(String id) throws ClassNotFoundException, SQLException{
        StudentDto dto = studentmodel.searchStudent(id);
        return dto;
    }
    
    public boolean updateStudent(StudentDto dto) throws ClassNotFoundException, SQLException{
        boolean resp = studentmodel.updateStudent(dto);
        return resp;
    }
}
