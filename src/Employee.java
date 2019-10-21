
public abstract class Employee {
	private String name;
	private int ID;
	
	
	public abstract String toString();
	public abstract int work();
	
	public Employee(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}


}
