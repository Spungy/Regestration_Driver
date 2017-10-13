package Simon_Murtagh11170381.Reg_Driver;

import Simon_Murtagh11170381.Student_Register.module;
import Simon_Murtagh11170381.Student_Register.program;
import Simon_Murtagh11170381.Student_Register.student;


public class reg_driver {
	
	public static void main(String[] args) {

		student student1  =  new student ("Simon Murtagh",    11170381, "4BP",  "08-12-1987");
		student student2  =  new student ("Eamon Tracy",      11170382, "4BP",  "22-11-1990");
		student student3  =  new student ("Jacky Jones",      11170383, "4BP",  "01-09-1986"  );
		student student4  =  new student ("Steve Stephenson", 11170384, "4BP",  "14-05-1989" ); 
				
		
		module CT417      =  new module ("Engineering Software 3", "CT417");	
		module EE345      =  new module ("System On Chip",         "EE345");
		module EE355      =  new module ("Final Year Project",     "EE355");	
		module CT435      =  new module ("Machine Learning",       "CT435");
		
		program Eng_4bp   =  new program("Electronic and Computer Engineering", "4BP",CT417, "01-09-2017", "30-05-2018");
	
		
		EE345.addStudent(student1);
		EE345.addStudent(student2);
		EE345.addStudent(student3);
		EE345.addStudent(student4);	
		
		EE355.addStudent(student1);
		EE355.addStudent(student2);
		EE355.addStudent(student3);
		EE355.addStudent(student4);
		
		CT435.addStudent(student1);
		CT435.addStudent(student2);
		CT435.addStudent(student3);
		CT435.addStudent(student4);
	
		CT417.addStudent(student1);
		CT417.addStudent(student2);
		CT417.addStudent(student3);
		CT417.addStudent(student4);
		
		Eng_4bp.addModule(EE345);
		Eng_4bp.addModule(EE355);
		Eng_4bp.addModule(CT435);
		Eng_4bp.addModule(CT417);
		
		System.out.println(Eng_4bp.listDetails());
		System.out.println(CT417.listModuleDetails());
		System.out.println(CT435.listModuleDetails());
		System.out.println(EE355.listModuleDetails());
		System.out.println(EE345.listModuleDetails());
		System.out.println(student1.toString());
		System.out.println(student1.getUsername());	
		System.out.println(student2.toString());
		System.out.println(student2.getUsername());	
		System.out.println(student3.toString());
		System.out.println(student3.getUsername());	
		System.out.println(student4.toString());
		System.out.println(student4.getUsername());	
			
	}
}
