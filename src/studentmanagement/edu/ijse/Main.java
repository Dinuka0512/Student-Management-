/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement.edu.ijse;
import studentmanagement.edu.ijse.view.StudentManageView;
/**
 *
 * @author dinuka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManageView v1 = new StudentManageView();
        v1.setLocationRelativeTo(null);
        v1.setTitle("manage students");
        v1.setVisible(true);
    }
    
}
