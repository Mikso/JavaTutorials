/**
 * 
 */
package com.JDBC;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
*/

import java.sql.*;

/**
 * @author Bruno
 *
 */
public class AcessoBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		String sql	=	"select Nome from pessoa";
		String url	=	"jdbc:mysql://127.0.0.1:3306/javabd";
		String password	=	"";
		String user	=	"root";
		
		
		try{
			String Driver	=	"com.mysql.jdbc.Driver";
			Class.forName(Driver);
		}catch(ClassNotFoundException d){
			System.out.println(d);
		}
		
		
		try {
		Connection con	=	DriverManager.getConnection(url, user, password);
		PreparedStatement stm	=	con.prepareStatement(sql);
		ResultSet	rs	=	stm.executeQuery();
		
		System.out.println("Conectado com sucesso!");
		
		while(rs.next()){
			System.out.println(rs.getString("nome"));
		}
		
			con.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}

}
