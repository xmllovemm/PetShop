package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import lemon.beans.User;

public class test1 {

	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
//		User u = (User)context.getBean("user1");
//				
//		DataSource ds = (DataSource)context.getBean("ds");
//		try {
//			Connection conn = ds.getConnection();		
//			PreparedStatement pstmt = conn.prepareStatement("select * from test.t_user");
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
//			}
//		} catch (Exception e) {		
//			e.printStackTrace();
//		}
		
		Configuration configuration = new Configuration().configure("file:src/main/resources/hibernate.hbm.xml");
		SessionFactory factory = configuration.buildSessionFactory();		
		Session session = factory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, 2);
		session.close();
		factory.close();	
		System.out.println(user);
	}

}
