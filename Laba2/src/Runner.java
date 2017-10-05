
public class Runner {

	public static void main (String[] args) {
		 People [] peoples = {
	                new People("Alexei Ivanov", "Men",16),
	                new SchoolChildren("Daria Piz", "Women", 15, 10, "G"),
	                new Students("Petr Sinicen", "Men", 18, "Fizicheskiy", "fizika", "FB 21"),
	                new GraduateStudent("Sidorov", "Men", 21, "Grafica", "Skvartsov"),
	                new People(),
	                new SchoolChildren(null, null, 0),
	                new Students(null, null, 0),
	                new SchoolChildren("Masha Zuk", "Women", 14, 9, "F"),
	                new Students("Gregoriy Grov", "Men", 19, "Biology", "Teacher", "BF 35"),
	                new GraduateStudent("Evgen Sharov", "Men", 20, "Programm", "Spaval")
	        };

	        for (int i=0; i<peoples.length; i++){
	            System.out.println(peoples[i].toString()) ;
	            peoples[i].namesClass();
	        }
	    }
}
