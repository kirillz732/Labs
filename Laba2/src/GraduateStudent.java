
public class GraduateStudent extends People{
	private String workName;
	private String teacherName;
	public GraduateStudent(String names, String sex, int age, String workName, String teacherName) {
		super(names, sex, age);
		this.workName = workName;
		this.teacherName = teacherName;
	}
	public GraduateStudent(String names, String sex, int age, String workName) {
		super(names, sex, age);
		this.workName = workName;
	}
	public GraduateStudent(String names, String sex, int age) {
		super(names, sex, age);
	}
	@Override
	public String toString() {
		return super.toString() + "GraduateStudent Work Name = " + workName + ", Teacher Name = " + teacherName + " ";
	};
	@Override
	public void namesClass() {
		System.out.println("This is Graduate Students");
	}
}
