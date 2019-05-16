package com.atguigu.springboot02quick;

import com.atguigu.springboot02quick.test.TestClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot02QuickApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","cqqxcs","password");
		System.out.println(conn);
		TestClass s = new TestClass();
		s.inc();
		SpringApplication.run(SpringBoot02QuickApplication.class, args);
	}

}
