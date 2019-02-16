/*
 * 					DCS
 * 			MIS	
 * 	TCL
 */
 
public class AssociationTest {
	public static void main(String[] args) {
		/*Person p = new Person();
		//String str = p.toString();
		System.out.println("str :"+p);
		
		//p.gender='F';
		//p.age=22;
		
		p.setGender('F');
		//p.setAge(22);
		p.setName("Julie");
		
		System.out.println("str :"+p);
		
		//p.showPerson();
		System.out.println("=======================");*/

		SmartPhone smPh = new SmartPhone ();
		
		Student s1 = new Student('M',23,"Arjun",123, "Galgotia GN", "Electronics");
		Student s2 = new Student('F',23,"Simran",124, "GH Raisoni", "Computer Science");
		Student s3 = new Student('F',22,"Pooja",125, "Shah & Anchor", "Computer Science");
		Student s4 = new Student('F',22,"Diksha",126, "MIT", "Computer Science");
		Student s5 = new Student('F',22,"Manali",127, "Sinhgad Institute", "Electronic and Tele");
		
		
		s1.pCard.setPanCard("AMDRE3433A", "Arjun Sisodia", "4-9-1995", "N.N. Nand Sisodia", "India");
		s2.pCard.setPanCard("TOREE1433B", "Simran Bhat", "11-11-1995", "Naresh Kumar Bhat", "India");
		s3.pCard.setPanCard("QWEA5433C", "Pooja LokeshKumar", "5-12-1996", "LokeshKumar GT", "India");
		s4.pCard.setPanCard("GHGFF7433D", "Diksha Saraswat", "1-1-1997", "ShivKumar Saraswat", "India");
		s5.pCard.setPanCard("PUUUY8433F", "Manali Kshirsagar", "6-11-1996", "Pravin Kshirsagar", "India");
		
		
		s1.showPerson(); //inherited function
		s1.showStudent(); // exclusive function
	
		s1.rpt1.setPhy(97);
		s1.rpt1.setChem(84);
		s1.rpt1.setMaths(100);
		s1.rpt1.setEng1(67);
		s1.rpt1.setEng2(69);
		s1.rpt1.setEng3(68);
		
		s1.rpt1.showReportCard();
		
		//s1.studying();
		//s1.studying(smPh);
		
		//Project project1 = s1.create(4, "Online Banking");
	//	System.out.println("Project information is : "+project1);	
		System.out.println("--------------------------------------");
		
		s2.showPerson(); //inherited function
		s2.showStudent(); // exclusive function
	
		s2.rpt1.setPhy(77);
		s2.rpt1.setChem(82);
		s2.rpt1.setMaths(73);
		s2.rpt1.setEng1(62);
		s2.rpt1.setEng2(64);
		s2.rpt1.setEng3(70);
		
		s2.rpt1.showReportCard();
		
		//s1.studying();
		//s2.studying(smPh);
		
		//Project project2 = s2.create(4, "Online Banking");
		//System.out.println("Project information is : "+project2);	
		
		//s1.studying();
	
		
		
		//s1.showPerson(); //inherited function
	//	s1.showStudent(); // exclusive function
		
		/*s1.setAge(22); //inherited function
		s1.setName("Julie"); //inherited function
		s1.setGender('F'); //inherited function
		s1.setRollNumber(123);
		s1.setCollegeName("SRM");
		s1.setStream("Mech Eng");*/
		
		
	}
}
//Object =>  11 methods
//getClass()
//hashCode(),
//equals(),
//clone(),
//toString(),
//notify(), notifyAll()
//wait(long), wait(long,int),wait(), 
//finalize()

class PanCard
{
	private String panNumber;
	private String panNumberName;
	private String birthDate;
	private String fatherName;
	private String countryName;
	
	public PanCard() {
		super();
		System.out.println("PanCard() created...");
	}
	
	public void setPanCard(String panNumber, String panNumberName, String birthDate, String fatherName, String countryName) {
		this.panNumber = panNumber;
		this.panNumberName = panNumberName;
		this.birthDate = birthDate;
		this.fatherName = fatherName;
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "PanCard [panNumber=" + panNumber + ", panNumberName=" + panNumberName + ", birthDate=" + birthDate
				+ ", fatherName=" + fatherName + ", countryName=" + countryName + "]";
	}
	
	
	
	
}
//gender  age	name  pCard
//						
// Person  p = new Person()
class Person //  extends Object --- root class 
{
	private char gender;
	private int age;
	private String name;
	protected PanCard pCard = new PanCard(); //hasA
	//int height;
	//int weight;
	
	public Person() {
		System.out.println("Person() explicit no-arg constructor...");
	}
	public Person(char gender, int age, String name) {
		super();
		System.out.println("Person(char,int,String)....");
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	public Person(char gender, int age) {
		super();
		System.out.println("Person(char,int)....");
		this.gender = gender;
		this.age = age;
	}
	public Person(char gender) {
		super();
		System.out.println("Person(char)....");
		this.gender = gender;
	}
	public Person(int age) {
		super();
		System.out.println("Person(int)....");
		this.age = age;
	}
	public Person(String name) {
		super();
		System.out.println("Person(String)....");
		this.name = name;
	}
	public Person(int age, String name) {
		super();
		System.out.println("Person(int,String)....");
		this.age = age;
		this.name = name;
	}
	public Person(char gender, String name) {
		super();
		System.out.println("Person(char,String)....");
		this.gender = gender;
		this.name = name;
	}
	public Person(String name,int age,char gender) {
		super();
		System.out.println("Person(String,int,char)....");
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	public void setGender(char gender) {
		System.out.println("Setting the gender...");
		this.gender = gender;
	}
	public void setAge(int age) {
		System.out.println("Setting the age...");
		this.age = age;
	}
	public void setName(String name) {
		System.out.println("Setting the name...");
		this.name=name;
	}
	
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
	/*public String toString() {
		return "Person is : "+gender+" "+age+" "+name;
	}*/
	
	public void showPerson() {
		System.out.println("Gender		: " + gender);
		System.out.println("Age		: " + age);
		System.out.println("Name		: " + name);
		System.out.println("PanCard : " + pCard);
	}

//	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
}

class ReportCard // extends Object
{
	private float phy;	private float chem;	private float maths;
	private float eng1;	private float eng2;	private float eng3;
	private float total;	private float avg;	private char grade;
	
	public ReportCard() {
		
	}
	public ReportCard(float phy, float chem, float maths, float eng1, float eng2, float eng3) {
		super();
		this.phy = phy;		this.chem = chem;		this.maths = maths;
		this.eng1 = eng1;		this.eng2 = eng2;		this.eng3 = eng3;
	}
	
	public float getPhy() {
		return phy;
	}
	public void setPhy(float phy) {
		this.phy = phy;
	}
	public float getChem() {
		return chem;
	}
	public void setChem(float chem) {
		this.chem = chem;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getEng1() {
		return eng1;
	}
	public void setEng1(float eng1) {
		this.eng1 = eng1;
	}
	public float getEng2() {
		return eng2;
	}
	public void setEng2(float eng2) {
		this.eng2 = eng2;
	}
	public float getEng3() {
		return eng3;
	}
	public void setEng3(float eng3) {
		this.eng3 = eng3;
	}
	public void showReportCard() {
			
		System.out.println("Phy	: "+phy);
		System.out.println("Che	: "+chem);
		System.out.println("Maths	: "+maths);
		System.out.println("Eng1	: "+eng1);
		System.out.println("Eng2	: "+eng2);
		System.out.println("Eng3	: "+eng3);
		
		total = calculateTotal();
		avg = calculateAverage();
		grade = calculateGrade();
		
		System.out.println("Total	: "+total);
		System.out.println("Avg	: "+avg);
		System.out.println("Grade	: "+grade);
	}
	
	private float  calculateTotal() {
		total = phy +chem+maths+eng1+eng2+eng3;
		return total;
	}
	private float  calculateAverage() {
		avg = total / 6;
		return avg;
	}
	
	private char  calculateGrade() {
		if ( avg >= 90 &&  avg <=100) {
			grade='A';
		}
		else if ( avg >= 75 &&  avg <90 ) {
			grade='B';
		}
		else if ( avg >= 60 &&  avg <75 ) {
			grade='C';
		}
		else if ( avg >= 45 &&  avg <60 ) {
			grade='D';
		}
		else if ( avg >= 35 &&  avg <45 ) {
			grade='E';
		}
		else if ( avg >= 1 &&  avg <35 ) {
			grade='F';
		}
		else if ( avg < 0 ) {
			grade='G';
		}
		return grade;
	}
}

class Phone
{
	void dial() {
		System.out.println("dialing....");
	}
}
class SmartPhone extends Phone
{
	void whatsApp() {
		System.out.println("WhatsApp......");
	}
	void readPPTs() {
		System.out.println("Reading SQL and PLSQL ppts...reading HFJ");
	}
}

class Project
{
	private int teamSize;
	private String projectTitle;
	
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	
	@Override
	public String toString() {
		return "Project [teamSize=" + teamSize + ", projectTitle=" + projectTitle + "]";
	}
}

class Student extends Person //isA
{
	private int rollNumber; //hasA
	private String collegeName; //hasA
	private String stream; //hasA
	ReportCard rpt1 = new ReportCard(); //hasA
	
	public Student(char gender, int age, String name, int rollNumber, String collegeName, String stream) {
		super(gender, age, name);
		System.out.println("Student(char,int,String,int,String,String)");
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
	}
	public Student(String name, int age, char gender, int rollNumber, String collegeName, String stream) {
		super(name, age, gender);
		System.out.println("Student(String,int,char,int,String,String)");
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
	}
	
	void studying()
	{
		System.out.println("Student is studying...");
	}
	
								//usesA
	void studying(SmartPhone ref) { //where when  why what how who
		System.out.println("Studying.....");
		System.out.println("Studying.....");
		//ref.whatsApp(); //exclusive....
		ref.readPPTs();
		System.out.println("Studying.....");
		System.out.println("Studying.....");
		System.out.println("Studying.....");
		ref.dial(); //inherited from Phone
		System.out.println("Studying.....");
		System.out.println("Studying.....");
	}
	
	//producesA	
	Project create(int ts, String title) {
		Project proj = new Project(); //blank project
		proj.setTeamSize(ts); //fill up
		proj.setProjectTitle(title); //fil up 
		return proj; //send it to the invoker
	}
	public void showStudent() {
		System.out.println("RollNumber	: "+rollNumber);	
		System.out.println("CollegeName	: "+collegeName);
		System.out.println("Stream		: "+stream);
	}

	public int getRollNumber() {
		System.out.println("getRollNumber()");
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("setRollNumber(int)");
		this.rollNumber = rollNumber;
	}

	public String getCollegeName() {
		System.out.println("getCollegeName()");
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		System.out.println("setCollegeName(String)");
		this.collegeName = collegeName;
	}

	public String getStream() {
		System.out.println("getStream()");
		return stream;
	}

	public void setStream(String stream) {
		System.out.println("setStream(String)");
		this.stream = stream;
	}
}
