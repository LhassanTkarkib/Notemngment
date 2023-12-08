import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Services implements IServices {

	ArrayList<Student> students = new  ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	
	public void addStudent(Student s) {
		students.add(s); 
	}
	


	
	
	
   /* public Student searchStudent(String name) {
		for (Student s :students) {
			if( s.getName().equals(name))
			{
				// add a way to sysout his notes 
				return s;
			}
		}
		return null;	
	} */
    
	
    public void displaynames(List<Student> students) {
    	for (Student s :students) {
    		
    		System.out.println(s);		
		}
	}
    
    public void displaysubjects(Student student) {
    	
    	
    	for (Subject sub : student.subjects) {
    		
    		System.out.println(sub);		
    	
		}
	}

    
    public Student getStudentByName(String name) {
        
    	for (Student s :students) {
    		if(s.getName().equals(name)) {
    			return s;
    		}	
		}
    	return null;
     
    }
    
    
    private Subject getSubjectByName(Student student, String subjectname) {
        for (Subject sub : student.subjects) {
            if (sub.subjectName.equals(subjectname)) {
                return sub;
            }
        }
        return null;
    }
  
    public void addmarks(String name, String subjectname, double mark) {
        Student student = getStudentByName(name);

        if (student != null) {
            Subject subject = getSubjectByName(student, subjectname);

            if (subject != null) {
                subject.marks.add(mark);
                System.out.println("Marks has been added successfully.");
            } else {
                System.out.println("there is no such a subject .");
            }
        } else {
            System.out.println("there is no student.");
        }
    }
    
	
	public void addSubject(String name, Subject subname) {
		Student student = getStudentByName(name);
		
            student.subjects.add(subname);
            System.out.println("Subject has been added successfully.");
        
		
	}
	
	

	
	public void calcSubAverage() {
	
		
	}

	
	public void calcGlobAverage() {
		
		
	}






	@Override
	public void addmarks() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public Student displaynames() {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public void addSubject() {
		// TODO Auto-generated method stub
		
	}

}
