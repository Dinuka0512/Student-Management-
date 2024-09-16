/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement.edu.ijse.model;
import studentmanagement.Database.DBConnection;
import java.sql.Connection;
import studentmanagement.edu.ijse.dto.StudentDto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author dinuka
 */
public class StudentModel {
    public List<StudentDto> getAllStudents() throws ClassNotFoundException, SQLException{
        //create connection 
        Connection connection = DBConnection.getInstance().getConnection();
        
        //write queree & passed that queree to preparedment statement
        String queree = "SELECT * FROM Student";
        PreparedStatement stm = connection.prepareCall(queree);
        
        List<StudentDto> customerDtos = new ArrayList<>();
        
        ResultSet rst = stm.executeQuery();
        while(rst.next()){
            StudentDto dto = new StudentDto(rst.getString(1),rst.getString(2),rst.getString(3),rst.getInt(4));
            customerDtos.add(dto);
        }
        
        return customerDtos;
    }
    
    public String saveStudentModel(StudentDto dto) throws ClassNotFoundException, SQLException{
        //create connection 
        Connection connection = DBConnection.getInstance().getConnection();
        
        //write queree & passed that queree to preparedment statement
        String queree = "INSERT INTO Student VALUES(?,?,?,?)";
        PreparedStatement stm = connection.prepareCall(queree);
        
        stm.setString(1, dto.getStudentID());
        stm.setString(2, dto.getName());
        stm.setString(3, dto.getAddress());
        stm.setInt(4, dto.getGrade());
        
        int result = stm.executeUpdate();
        return result > 0 ? "Successfully Saved" : "Fail";
    }
    
    public StudentDto searchStudent(String Id) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String queree = "SELECT * FROM Student WHERE stuId = ?";
        PreparedStatement statement = connection.prepareCall(queree);
        statement.setString(1, Id);
        
        ResultSet res = statement.executeQuery();
        
        if(res.next()){
            StudentDto dto = new StudentDto(
                    res.getString("stuId"),
                    res.getString("name"),
                    res.getString("Address"),
                    res.getInt("grade")
            );
            
            return dto;
        }
        
        return null;
    }
    
    public boolean updateStudent(StudentDto dto) throws ClassNotFoundException, SQLException{
        String queree = "UPDATE Student SET name = ?, Address = ?, grade = ? WHERE stuId = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(queree);
        
        statement.setString(1,dto.getName());
        statement.setString(2,dto.getAddress());
        statement.setInt(3,dto.getGrade());
        statement.setString(4,dto.getStudentID());
        
        int resp = statement.executeUpdate();
        return (resp != 0)? true : false;
    }
}
