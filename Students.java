public class Students {
	
	private String name;
	private String major;
	private int grade;

	public Students() {
		name = " ";
		major = " ";
		grade = 0;
	}

	public Students(String n, String m, int g){
		name = n;
		major = m;
		grade = g;
	}

	public void setName(String n){
		name = n;
	}

	public void setMajor(String m){
		major = m;
	}

	public void setGrade(int g){
		grade = g;
	}

	public String getName(){
		return name;
	}

	public String getMajor(){
		return major;
	}
	public int getGrade(){
		return grade;
	}

	//add a toString method
	public String toString() {
		String string = "Name: " + name + "\nMajor: " + major + "\nGrade: " + grade + "\n";
		return string;
	}
}