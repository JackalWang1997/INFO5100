package assignment3;

class Student{
    private String Name;
    private String ID;
    public Student(String n, String i){
        Name = n;
        ID = i;

    } 
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public void setName(String n){
        Name = n;
    }
    public void setID(String i){
        ID = i;
    }
}
class Course{
    private String courseName;
    private int num;
    private Student []studentAry;   
    public Course(String c, int n){
        courseName = c;
        num = n;
        studentAry = new Student[10];
    }
    public Student[] getStudents(){
        return studentAry;
    }
    public  String getCourseName(){
        return courseName;
    }

    public int getNum(){
        return num;
    }
    public void setCourseName(String c){
        courseName = c;
    }
    public void setNum(int n){
        num = n;
    }
    public  void registerStudent (Student student){
        if (num <10){
            studentAry[num] = student;
            num+=1;
        }
    }
    public boolean isFull(){
        if (num < 10){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String args[]) {
    Student student1=new Student("a", "111");
    Student student2=new Student("b", "111");
    Student student3=new Student("c", "111");
    Student student4=new Student("d", "111");
    Student student5=new Student("e", "111");
    Student student6=new Student("f", "111");
    Student student7=new Student("g", "111");
    Student student8=new Student("h", "111");
    Student student9=new Student("i", "111");
    Student student10=new Student("j", "111");
    Course java=new Course("java",0);
    Course matlab=new Course("matlab",0);
    java.registerStudent(student1);
    java.registerStudent(student2);
    java.registerStudent(student3);
    java.registerStudent(student4);
    java.registerStudent(student5);
    java.registerStudent(student6);
    java.registerStudent(student7);
    java.registerStudent(student8);
    java.registerStudent(student9);
    java.registerStudent(student10);
    matlab.registerStudent(student1);
    matlab.registerStudent(student2);
    matlab.registerStudent(student3);
    matlab.registerStudent(student4);
    matlab.registerStudent(student5);
    matlab.registerStudent(student6);
    matlab.registerStudent(student7);
    matlab.registerStudent(student8);
    matlab.registerStudent(student9);
    matlab.registerStudent(student10);
    System.out.println(java.isFull());
    System.out.println(java.getCourseName());
    for(Student t : java.getStudents()) {
    	if(t!=null) {
    		System.out.println(t.getName());
    	}
    	else {
    		break;
    	}
    }
    System.out.println(matlab.isFull());
    System.out.println(matlab.getCourseName());
    for(Student t : matlab.getStudents()) {
    	if(t!=null) {
    		System.out.println(t.getName());
    	}
    	else {
    		break;
    	}
    }
    }
}
