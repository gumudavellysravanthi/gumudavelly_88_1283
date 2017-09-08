import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	int arr=new arr{1,2,3,4,5};
	int length=new arr.length;
	private int index;




	
	public StudentGroup(int length) {
	super();

	}

	@Override
	public Student[] getStudents() {
	return arr;
	}

	@Override
	public void setStudents(Student[] students) {
	for(i=0;i<=length-1;i++)
	this.arr=arr;
	}

	@Override
	public Student getStudent(int index) {
	static void getstudent()
{

for(int i=0;i<temp;i++)
{
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.print("\n\n");


}

}


	}

	@Override
	public void setStudent(Student student, int index) {
	static void setstudent()
  {

    Scanner sn=new Scanner(System.in);

 System.out.print(" enter student name  ");

   name[temp]=sn.next();

 System.out.print(" enter student date of birth  ");

   dob[temp]=sn.next();


 System.out.print(" enter student marks  ");

   marks[temp]=sn.nextInt();



temp++;
   }

	}

	@Override
	public void addFirst(Student student) {

	}

	@Override
	public void addLast(Student student) {

	}

	@Override
	public void remove(int index) {

	}

	@Override
	public void remove(Student student) {

	}

	@Override
	public void removeFromIndex(int index) {

	}

	@Override
	public void removeFromElement(Student student) {

	}

	@Override
	public void removeToIndex(int index) {

	}

	@Override
	public void removeToElement(Student student) {

	}

	@Override
	public void bubbleSort() {

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		static void getbybirthdate()
{
String d=new String();
Scanner sn=new Scanner(System.in);
d=sn.next();
for(int i=0;i<temp;i++)
{

//if(d.compareTo(dob[i])==0)
if(d.equals(DOB[i]))
{
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.print("\n\n");
}

}

}

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	static void nearbybirth()
{
Scanner sn=new Scanner(System.in);
int i=sn.nextInt();
String abc=sn.next();
Date date = new Date();
		System.out.println("Todays date: "+date.toString());
		//test addDays method
		int k=i;
		//while(i<=k){
			Date newDate = addDays(date, i);
			System.out.println("Java Date after adding "+i+" days: "+newDate.toString());
			//i+=10;
		//}
		System.out.println("\n\n");
		//test subtractDays method
	
	//	while(i<=k){
	//		Date newDate = subtractDays(date, 10);
	//		System.out.println("Java Date after subtracting "+i+" days: "+newDate.toString());
	//		i+=10;
	//	}

	
}
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {
		static void getbyage()
{
for(int i=0;i<temp;i++)
{
String datetext = dob[i]; // Date in text


try {
      Calendar birth = new GregorianCalendar();
      Calendar today = new GregorianCalendar();
      int age = 0;
      int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
      Date birthDate = new SimpleDateFormat("MM-dd-yyyy").parse(datetext);
      Date currentDate = new Date(); //current date
      
      birth.setTime(birthDate);
      today.setTime(currentDate);
      
      // check if birthday has been celebrated this year
      if(today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            factor = -1; //birthday not celebrated
      }
      age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;
System.out.print("\n\n");
System.out.println("student name = "+name[i]);
System.out.println("student date of birth = "+dob[i]);
System.out.println("student marks = "+marks[i]);
System.out.println("AGE (years): "+age);

System.out.print("\n\n");

} catch (Exception e) {
      System.out.println("Given date: "+datetext+ " not in expected format (Please enter a MM-DD-YYYY date)");
}
}
}

	}
}
