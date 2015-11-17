package org.darion.yaphet.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Darion.Yaphet
 *
 */
public class SQLite3Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Loading JDBC Class
		Class.forName("org.sqlite.JDBC");

		//
		Connection connection = DriverManager.getConnection("jdbc:sqlite:darion.db");

		Statement statement = connection.createStatement();

		statement.executeUpdate("create table tbl1(name varchar(20), salary int);");

		statement.executeUpdate("insert into tbl1 values('ZhangSan',8000);");
		statement.executeUpdate("insert into tbl1 values('LiSi',7800);");
		statement.executeUpdate("insert into tbl1 values('WangWu',5800);");
		statement.executeUpdate("insert into tbl1 values('ZhaoLiu',9100);");

		ResultSet resultSet = statement.executeQuery("select * from tbl1;");

		while (resultSet.next()) {

		}

		resultSet.close();
		statement.close();
		connection.close();
	}
}
