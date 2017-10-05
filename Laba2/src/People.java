
public class People {
	private String names;
	private String sex;
	private int age;
	public People(String names, String sex, int age) {
		this.names = names;
		this.sex = sex;
		this.age = age;
	}
	public People(String names) {
		super();
		this.names = names;
	}
	public People() {
		super();
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People Names = " + names + ", Sex = " + sex + ", Age = " + age + " ";
	}
	public void namesClass() {
		System.out.println("This is People");
	}
	
	}


