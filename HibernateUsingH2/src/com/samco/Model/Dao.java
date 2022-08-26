package com.samco.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Dao {
	public static void main(String[] args) {
	
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id : ");
			int ID = sc.nextInt();

			Configuration cfg = new Configuration();
			cfg.configure("Config.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			@SuppressWarnings("unchecked")
			List <Student> li = session.createQuery("from Student where ID=" + ID).list();
			Iterator it = li.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				Student student = (Student) obj;
				System.out.println(student.getID());
				System.out.println(student.getNAME());
				System.out.println(student.getDEPT());
				System.out.println(student.getYR());
			
			

			MongoClientURI uri = new MongoClientURI("mongodb+srv://kalaiselvan:hello@cluster.aesy1nb.mongodb.net/?retryWrites=true&w=majority");
			MongoClient client = new MongoClient(uri);
			DB db = client.getDB("student");
			DBCollection collection = db.getCollection("student_info");
			Student stu = new Student();

			/*
			 * stu.setDEPT(stu.getDEPT()); stu.setID(stu.getID());
			 * stu.setNAME(stu.getNAME()); stu.setYR(stu.getYR());
			 */

			Gson gson = new Gson();
			String json = gson.toJson(student);
			BasicDBObject basicDBObject = new BasicDBObject("student", json);
			collection.save(basicDBObject);

			session.close();
			factory.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}