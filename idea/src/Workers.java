	//@formatter:on
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

	public class Workers implements Serializable {
		private String name;
		private double stazh;
		private String dolzhnost;
		private static final double stavka = 450;
		private double koef;

		public Workers(String name, double stazh, String dolzhnost, double koef) {
			this.name = name;
			this.stazh = stazh;
			this.dolzhnost = dolzhnost;
			this.koef = koef;
		}

			private double getMoney () throws CoefficientCheckException {
			if (koef <= 0) throw new CoefficientCheckException();
			return stavka * (koef * stazh);
		}


		public void setName(String name) {
			this.name = name;
		}

		public void setStazh(double stazh) {
			this.stazh = stazh;
		}

		public void setDolzhost(String dolzhost) {
			this.dolzhnost = dolzhost;
		}

		public String getName() {
			return name;
		}

		public double getStazh() {
			return stazh;
		}

		public String getDolzhost() {
			return dolzhnost;
		}

		@Override
		public String toString() {
			double money =0;
			try {
				money = getMoney();
			} catch (CoefficientCheckException ex) {
				ex.printStackTrace();

				ArrayList<Workers> spisok = new ArrayList<Workers>() ;
				Scanner sc = new Scanner(System.in);
				System.out.print("Введите количество сотрудников: ");
				int nomber = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < nomber; i++)  {
					System.out.print("Введен " + (i + 1) + "-й разработчик" + " ФИО: ");
										String name = sc.nextLine();
					System.out.print("Введен " + (i + 1) + "-й разработчик" + " Стаж: ");
					double stazh = sc.nextDouble();
					sc.nextLine();
					System.out.print("Введен " + (i + 1) + "-й разработчик" + " Должность: ");
					String dolzhnost = sc.nextLine();
					System.out.print("Введен " + (i + 1) + "-й разработчик" + " Коэффициент: ");
					double koef = sc.nextDouble();
					sc.nextLine();
					Workers work = new Workers(name, stazh, dolzhnost, koef);
					spisok.add(work);
				}
				File myFile = new File(  "workers.txt");

				try {
					FileOutputStream fileOutput = new FileOutputStream(myFile);
					ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);
					for (Workers wor: spisok)
						System.out.println(wor.toString());
					objectOut.writeObject(spisok);
					objectOut.flush();
					objectOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("\n Информация записана");
				System.out.println("\n Загрузка");

				try {
					FileInputStream fileInput = new FileInputStream(myFile);
					ObjectInputStream objectIn = new ObjectInputStream(fileInput);
					spisok.clear();
					spisok = (ArrayList<Workers>)objectIn.readObject();
					for (int i = 0; i < nomber; i++) {
						System.out.print(spisok.get(i).toString());
					}
					objectIn.close();
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			return " \n Разработчик: " +
					"\n Имя: " + name  +
					"\n Стаж: " + stazh +
					"\n Должность: " + dolzhnost +
					"\n Зарплата: " + money;	}
}
