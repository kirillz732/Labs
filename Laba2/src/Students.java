
public class Students extends People{
	private String faculty;
	private String specialty;
	private String nomberGroupe;
	public Students(String names, String sex, int age, String faculty, String specialty, String nomberGroupe) {
		super(names, sex, age);
		this.faculty = faculty;
		this.specialty = specialty;
		this.nomberGroupe = nomberGroupe;
	}
	public Students(String names, String sex, int age, String faculty) {
		super(names, sex, age);
		this.faculty = faculty;
	}
	public Students(String names, String sex, int age) {
		super(names, sex, age);
	}
	@Override
	public String toString() {
		return super.toString() + "Students faculty = " + faculty + ", specialty = " + specialty + ", Nomber Groupe = " + nomberGroupe + " ";
	}
	@Override
	public void namesClass() {
		System.out.println("This is Students");
	}
}
