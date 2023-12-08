import java.util.ArrayList;
import java.util.List;

public class Student {
List<Subject> subjects;
	String name;
	
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	 public Student(String name) {
	        this.name = name;
	        this.subjects = new ArrayList<>();
	    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "Student's name=" + name + "]";
	}
	
	
	
	
	
	
	
	
}
