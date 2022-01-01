import java.util.ArrayList;

public class CaveMan {

	private String name;
	private int age;
	private float weight;
	private ArrayList<Rock> rockCollection;
	
	
	//parameterized constructor
	public CaveMan(String n, int a, float w, ArrayList<Rock> r) {
		this.name = n;
		this.age = a;
		this.weight = w;
		this.rockCollection = r;
	}

	//default constructor
	public CaveMan() {
		this.name = "They haven't given me a name yet :-(";
		this.age = 0;
		this.weight = 100f;   //A f is added to the value to make sure it works properly
		this.rockCollection = new ArrayList<>(); //Initialized Array List
	}
	
	
	@Override
	public String toString() {
		return "CaveMan [name=" + name + ", age=" + age + ", weight=" + weight + ", rock collection = " + rockCollection + "]";
	}
	
	

	//Creating a method
	public void sayHi() {
		System.out.println("Hi my name is "+this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public ArrayList<Rock> getRockCollection() {
		return rockCollection;
	}

	public void setRockCollection(ArrayList<Rock> rockCollection) {
		this.rockCollection = rockCollection;
	}
	
	
	
	
	
}
