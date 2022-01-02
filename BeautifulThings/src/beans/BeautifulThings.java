package beans;

import java.util.ArrayList;

//This is going to be a list of BeautifulThings
public class BeautifulThings {
	
	ArrayList<BeautifulThing> theList = new ArrayList<BeautifulThing>();
	
	//This method adds something to the list
	public void add(BeautifulThing bt) {
		theList.add(bt);
	}

	//This methods prints all the elements int the list
	public void printAll() {
		System.out.println("========== These are a few beautiful things ============");
		
		for(BeautifulThing bt : theList){
			System.out.println("ID = "+bt.id+" Title: "+bt.thingTitle+" Description: "+bt.thingDescription+" Rating: "+bt.rating);
		}
		
		System.out.println("======== End of the list =========");
	}
}
