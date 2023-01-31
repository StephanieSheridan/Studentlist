/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttue23;

/**
 *
 * @author Stephanie
 */
public class studentList {
    public static void main(String[] args){
        
        //StudentTue23 s1= new StudentTue23("s1", "Ronak");
        StudentTue23[] studentList = new StudentTue23[3];
        studentList[0]=new StudentTue23("s1", "Ronak");
        studentList[1]=new StudentTue23("s2", "John");
        studentList[2]=new StudentTue23("s3", "xyz");
        
        for (StudentTue23 studentList1 : studentList) {
            System.out.println(studentList1.getStudentName());       
        }
    }
}