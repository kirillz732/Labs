
public class SchoolChildren extends People{
	private int nomberClass;
	private String letterClass;
	public SchoolChildren(String names, String sex, int age, int nomberClass, String letterClass) {
		super(names, sex, age);
		this.nomberClass = nomberClass;
		this.letterClass = letterClass;
	}
	public SchoolChildren(String names, String sex, int age, int nomberClass) {
		super(names, sex, age);
		this.nomberClass = nomberClass;
	}
	public SchoolChildren(String names, String sex, int age) {
		super(names, sex, age);
	}
	@Override
	public String toString() {
		return super.toString() + "SchoolChildren Nomber Class = " + nomberClass + ", Letter Class = " + letterClass + " ";
	}
	@Override
	public void namesClass() {
		System.out.println("This is Scholl Children");
	}
}
	

