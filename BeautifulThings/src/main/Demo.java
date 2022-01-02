package main;

import java.sql.SQLException;
import java.util.ArrayList;

import beans.BeautifulThing;
import beans.BeautifulThings;
//import beans.BeautifulThing;
//import beans.BeautifulThings;
import database.DatabaseServices;

public class Demo {

	public static void main(String[] args) throws SQLException {
	
		DatabaseServices ds = new DatabaseServices();
		
		ds.deleteOne(4);
		
//		BeautifulThing b = new BeautifulThing(0, "Snow", "Reminds me of a fairy tale", 9);
//		ds.insertOne(b);
		
		ArrayList<BeautifulThing> bList = new ArrayList<BeautifulThing>();
		bList = ds.readAll();
		
		BeautifulThing b = new BeautifulThing(0, "Birds", "They make my day happy", 8);
		ds.updateOne(12, b);
		
//		//This again prints the List
//		System.out.println("========== These are a few beautiful things ============");
//		
//		for(BeautifulThing bt : bList){
//			System.out.println("ID = "+bt.getId()+" Title: "+bt.getThingTitle()+" Description: "+bt.getThingDescription()+" Rating: "+bt.getRating());
//		}
//		
//		System.out.println("======== End of the list =========");
		
		
		
		
//		//Experimenting with classes and objects
//		BeautifulThing b = new BeautifulThing(0, "Lion cubs", "A cute bunch of big cats", 10);
//		
//		BeautifulThings bList = new BeautifulThings();
//		
//		bList.add(b);
//		bList.printAll();
	}
	

}
