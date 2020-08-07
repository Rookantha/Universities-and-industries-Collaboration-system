/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbConnection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.StudentRegister;

/**
 *
 * @author ISURU
 */
public class StudentRegController {
     public static int studentReg(StudentRegister studentReg) throws SQLException, ClassNotFoundException{
                int result=0;
		Connection connection = null;
		PreparedStatement preparedStatement= null;
         
                String sql= "insert into register (userType,fullName,subjects,univercity,email,userName,password,pswRepeat,discription) values(?,?,?,?,?,?,?,?,?)";
		try {
                                connection = new DbConnection().getConnection();
				preparedStatement = connection.prepareCall(sql);
				preparedStatement.setString(1,studentReg.getUserType());
                                preparedStatement.setString(2,studentReg.getFullName());
                                preparedStatement.setString(3,studentReg.getSubject());
                                preparedStatement.setString(4,studentReg.getUnivercity());
                                preparedStatement.setString(5,studentReg.getEmail());
                                preparedStatement.setString(6,studentReg.getUserName());
                                preparedStatement.setString(7,studentReg.getPassword());
                                preparedStatement.setString(8,studentReg.getPswRepeat());
                                preparedStatement.setString(9,studentReg.getDiscription());
                                result = preparedStatement.executeUpdate(); 
                                
				//preparedStatement.setString(2, user.getPassword());
				
                            //  ResultSet rs = preparedStatement.executeQuery();
                                  
                                
				
                   
                }       
                   
		finally {
			if(preparedStatement!=null) {
				preparedStatement.close();
			}
			if (connection !=null) {
				connection.close();
			}
                }
     
         return result;
             
     }
  }
