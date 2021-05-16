package de.tekup.soap.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import de.tekup.soap.models.whitetest.Exam;
import de.tekup.soap.models.whitetest.Student;
import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;


@Service
public class whiteTestService {
	
	
	
	public  WhiteTestResponse responseWhitetest (StudentRequest studentRequest)  {
		
		      WhiteTestResponse  whiteTestResponse  = new  WhiteTestResponse();
		      //StudentRequest request = new StudentRequest() ;
		        Student student1= new Student() ; 
		        student1.setId(1);
		        student1.setName("student1");
		        student1.setAddress("address1") ; 
		        
		        Student student2= new Student() ; 
		        student1.setId(2);
		        student1.setName("student2");
		        student1.setAddress("address2") ; 
		        
		        Student student3= new Student() ; 
		        student1.setId(3);
		        student1.setName("student3");
		        student1.setAddress("address3") ; 
		        
				List<Student> listStudent = new ArrayList<Student>() ;
				
				listStudent.add(student1) ; 
				listStudent.add(student2) ;
				listStudent.add(student3) ;
				/**************************************/
				Exam exam1 = new Exam() ; 
				exam1.setCode("hrty//") ; 
				exam1.setName("exam1");
				
				Exam exam2 = new Exam()  ; 
				exam2.setCode("ty87o");
				exam2.setName("exam2");
				
				Exam exam3 = new Exam() ;  
				exam3.setCode("rty898");
				exam3.setName("exam3");
				List<Exam> listExams = new ArrayList<Exam>() ;
				listExams.add(exam1) ;
				listExams.add(exam2) ; 
				listExams.add(exam3) ; 
				
				/**************************************/
				for (Student student : listStudent) {
					for (Exam exam : listExams) {
						if (student.getId()== studentRequest.getStudentId()&& exam.getCode().equals(studentRequest.getExamCode())  ) {
							whiteTestResponse.setStudent(student);
							/*whiteTestResponse.getStudent().getAddress() ; 
							whiteTestResponse.getStudent().getId() ; 
							whiteTestResponse.getStudent().getName(); */
							
							
							/**************/
							whiteTestResponse.setExam(exam) ; 
							/*whiteTestResponse.getExam().getCode() ; 
							whiteTestResponse.getExam().getName(); */
							
							
						
						}
					}
					
				}
				
				
				 /*Timestamp timestamp = new Timestamp(whiteTestResponse.getDate().toGregorianCalendar().getTimeInMillis());
				 whiteTestResponse.getDate().(long)setTimezone(timestamp);
				 */
			 
				
				
				return whiteTestResponse;
				
			}

}
