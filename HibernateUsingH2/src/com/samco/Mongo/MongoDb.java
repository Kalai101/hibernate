
package com.samco.Mongo;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.samco.Model.Student;

public class MongoDb {

	public static MongoDb mongoConnection() {
		MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
		try {

			MongoClient client = new MongoClient(uri);
			DB db = client.getDB("student");
			DBCollection collection = db.getCollection("student_info");
			Student stu = new Student();
			stu.setID(stu.getID());
			stu.setDEPT(stu.getDEPT());
			stu.setNAME(stu.getNAME());
			stu.setYR(stu.getYR());

			Gson gson = new Gson();
			String json = gson.toJson(stu);
			BasicDBObject basicDBObject = new BasicDBObject("student", json);
			collection.save(basicDBObject);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return mongoConnection();
	}
		public static void main(String args[]) {
		
			
	}
}
