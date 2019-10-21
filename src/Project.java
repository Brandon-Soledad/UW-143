import java.util.ArrayList;

public class Project {
	private int linesOfCode;
	private int duration;
	private int linesOfCodeWritten;
	private int linesOfCodeTested;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public Project(int linesOfCode, int duration){
		this.linesOfCode = linesOfCode;
		this.duration = duration;
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public int doProject(){
		while(linesOfCodeWritten < linesOfCode){
			for(Employee e: employees){
				if(e instanceof Programmer && linesOfCodeWritten < linesOfCode){
					linesOfCodeWritten += e.work();
				}
				else if(e instanceof Tester && linesOfCodeTested < linesOfCode){
					linesOfCodeTested += e.work();
				}
				duration++;
			}
		}
		return duration;
	}
	
	public int getlinesOfCode(){
		return this.linesOfCode;
	}
	
	public void setLinesOfCodeWritten(int lines){
		this.linesOfCodeWritten += lines;
	}
	
	public static void main(String[] args){
		Project one = new Project(1500,30);
		Employee e1 = new Programmer("Brandon", 1,150);
		Employee t1 = new Tester("John",2,150);
		one.addEmployee(e1);
		one.addEmployee(t1);
		System.out.println(e1.toString());
		System.out.println(t1.toString());
		System.out.println(one.doProject());
	}
}
