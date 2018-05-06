package mainPackage;

public class Student {
	public String StudentId; 
	private String FirstName;
	private String LastName; 
	private int Age;
    Student(String StudentId,String FirstName,String LastName,int Age){
    	this.StudentId=StudentId;
    	this.FirstName=FirstName;
    	this.LastName=LastName;
    	this.Age=Age;	
    }
    String getStudentId() {
		return StudentId;
    	
    }
    String getFirstName() {
    	return FirstName;
    }
    String getLastName() {
    	return LastName;
    }
    int getAge() {
    	return Age;
    }
    void setStudentId(String StudentId) {
    	this.StudentId=StudentId;
    }
    void setFirstName(String FirstName) {
    	this.FirstName=FirstName;
    }
    void setLastName(String LastName) {
    	this.LastName=LastName;
    }
    void setAge(int Age) {
    	this.Age=Age;
    }
}
