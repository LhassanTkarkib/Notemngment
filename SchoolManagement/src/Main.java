import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("insert ur name ");
		
		String userName = input.next();
		Services services = new Services();
		
		while (true) {
			
			System.out.println("what do you want");
			
			System.out.println("1- Add a student");
			System.out.println("2- Add a student's marks");
			System.out.println("3- Add a student's subject");
			System.out.println("3- display a student's marks");
			System.out.println("4- Calculate student subjects average");
			System.out.println("5- Calculate student mark average");
			System.out.println("0- leave ");
			
		int in1 = input.nextInt();	
		switch (in1) {
		case 1:
	        System.out.println("insert the student name ");
	        String name = input.next();
	        Student s1 = new Student(name);

	        boolean studentExists = false;
	        for (Student std : services.students) {
	            if (s1.name.equals(std.name) && !s1.subjects.isEmpty() && s1.subjects.get(0).marks.isEmpty()) {
	                System.out.println("the student exists, just add his notes ");
	                studentExists = true;
	                break;
	            }
	        }

	        if (!studentExists) {
	            services.addStudent(s1);
	            System.out.println("the student has been added");
	        }
	        break;
		
        case 2:
         System.out.println("select a student so u can add his marks");
			
         services.displaynames(services.students);
		 String std = input.next();
            
            for(Student tmp : services.students) {
				if (tmp.getName().equals(std) && !tmp.subjects.isEmpty()) {

					System.out.println("which subject do u want to add it s marks");
					services.displaysubjects(tmp);
					String Selectedsub = input.next();
					
					System.out.println("how many marks u have ?");
					int Nnotes = input.nextInt();
					
					for (int i = 1; i <= Nnotes; i++) {
						System.out.println("insert ur "+i+" mark");
						double mark = input.nextInt();
						
						if(mark>=0 && mark<=20) {
							
							  services.addmarks(std,Selectedsub,mark);
						}{
							System.out.println("your mark should be between 0 and 20");
						}
						
					}
					
				}{
					System.out.println("this student doesn't have subjects add at least on");
			
				}
			}				
    		
        	
        	
			break;	
			
        case 3:
        	  
        	 System.out.println("select a student so u can add him a subject");
        	 services.displaynames(services.students);
     		 String std2 = input.next();
     		 
     		  for(Student tmp : services.students) {
  				if (tmp.getName().equals(std2)) {
  					
  					System.out.println("how many subjects u wanna add ?");
  					 int nn = input.nextInt();
  					for (int i = 1; i <= nn; i++) {
  						System.out.println("insert ur "+nn+" subject name");
  						String subname = input.next();
  						
  						
  						 services.addSubject(std2,subname);
  					}
  					 

  				System.out.println("insert subject name");
  					
  				}{
  					System.out.println("there s no such student");
  			
  				}
  			}
     		 
     		 
     		 /*	System.out.println("add a subject");
  					services.displaysubjects(tmp);
  					String Selectedsub = input.next();
  					
  					System.out.println("how many marks u have ?");
  					int Nnotes = input.nextInt();
  					
  					for (int i = 1; i <= Nnotes; i++) {
  						System.out.println("insert ur "+i+" mark");
  						double mark = input.nextInt();
  						
  						if(mark>=0 && mark<=20) {
  							
  							  services.addmarks(std2,Selectedsub,mark);
  						}{
  							System.out.println("your mark should be between 0 and 20");
  						}
  						
  					}*/
     		 
        	 
        	 //services.displaysubjects();
        	
        	
          
        	break;
        	

        case 4:
        	
        	break;	
	
        case 0:
        	System.exit(0);
          
        	break;

		default:
			break;
		}
		
		
		}

	}

}
