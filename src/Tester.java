
import java.util.*;
public class Tester extends Employee {
	private int LinesOfCodeTestedPerDay;

	public Tester(String name, int ID, int LinesOfCodeTestedPerDay) {
		super(name, ID);
		// TODO Auto-generated constructor stub
	}
	
	public int work(){
		int lines;
		int fifty = (int)(LinesOfCodeTestedPerDay * .75);
		int one_fifty = (int)(LinesOfCodeTestedPerDay * 1.25);
		Random rand = new Random();
		lines = rand.nextInt((one_fifty - fifty) + 1) + fifty;
		return lines;
	}
	
	public int getLinesOfCodeTestedPerDay(){
		return LinesOfCodeTestedPerDay;
	}
	
	public void setLinesOfCodeTestedPerDay(int LinesOfCodeTestedPerDay){
		this.LinesOfCodeTestedPerDay = LinesOfCodeTestedPerDay;
	}
	
	@Override
	public String toString(){
		return "Programmer: " + getName() + "\n" + "ID: " + getID() + "\n" + "Lines of code tested: " + work();
	}

}
