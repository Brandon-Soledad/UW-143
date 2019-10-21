import java.util.*;
public class Programmer extends Employee{
	private int LinesOfCodePerDay;

	public Programmer(String name, int ID, int LinesOfCodePerDay) {
		super(name, ID);
		this.LinesOfCodePerDay = LinesOfCodePerDay;
		// TODO Auto-generated constructor stub
	}
	
	public int work(){
		int lines;
		int fifty = (int)(LinesOfCodePerDay * .5);
		int one_fifty = (int)(LinesOfCodePerDay * 1.5);
		Random rand = new Random();
		lines = rand.nextInt((one_fifty - fifty) + 1) + fifty;
		return lines;
	}
	
	public int getLinesOfCodePerDay(){
		return LinesOfCodePerDay;
	}
	
	public void setLinesOfCodePerDay(int LinesOfCodePerDay){
		this.LinesOfCodePerDay = LinesOfCodePerDay;
	}
	
	@Override
	public String toString(){
		return "Programmer: " + getName() + "\n" + "ID: " + getID() + "\n" + "Lines of code written: " + work();
	}

	
}
