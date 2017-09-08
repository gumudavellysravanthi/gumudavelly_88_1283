import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Student implements Comparable 
{
	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;
	static String[] fullName=new String[100];
    static Date[] birthDate=new Date[100];
    double[] Marks=new double[100];
	static int temp;
	public static void main(String[] args)
	public Student(int id, String fullName, Date birthDate, double avgMark) {
		ID = id;
		this.fullName = fullName;
		DOB = birthDate;
		Marks = avgMark;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	ID = id;
	}
	public String getFullName() {
	return fullName;
	}
	public void setFullName(String fullName) {
	this.fullName = fullName;
	}
	public Date getBirthDate() {
	String d=new String();
    Scanner sn=new Scanner(System.in);
	d=sn.next();
	for(int i=0;i<temp;i++)
	{
	if(d.equals(DOB[i]))
	{
	System.out.print("\n\n");
	System.out.println("student name = "+name[i]);
	System.out.println("student date of birth = "+dob[i]);
	System.out.println("student marks = "+marks[i]);
	System.out.print("\n\n");
	}}
	}
    public void setBirthDate(Date birthDate) {
	DOB= birthDate;
	}
    public double getAvgMark() {
	return avgMark;
	}

	public void setAvgMark(double avgMark) {
	Marks=avgMark;
	}
	@Override
	public boolean equals(Object o) {
	 if (this == o) {
     return true;
    }
    if (o == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    return this.getId().equals(o.getId());
}}
	@Override
	public int hashCode() {
	return getId().hashCode();
	}
	@Override
	public int compareTo(Object o) {
	int cmp = getFullName().compareToIgnoreCase(g.getFullName());
       if (cmp != 0) return cmp;
        return (getId() < g.getId() ? -1 : getId() == g.getId() ? 0 : 1);
	}}}}
	
}


