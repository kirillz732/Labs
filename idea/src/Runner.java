import javafx.concurrent.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {

		ArrayList<Workers> spisok = new ArrayList<Workers>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество сотрудников: ");
		int nomber = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < nomber; i++) {
			System.out.print("Введен " + (i + 1) + "-й разработчик" + " ФИО: ");
			String name = sc.nextLine();
			System.out.print("Введен " + (i + 1) + "-й разработчик" + " Стаж: ");
			double stazh = sc.nextDouble();
			sc.nextLine();
			System.out.print("Введен " + (i + 1) + "-й разработчик" + " Должность: ");
			String dolzhnost = sc.nextLine();
			System.out.print("Введен " + (i + 1) + "-й разработчик" + " Коэффициент: ");
			double koef= sc.nextDouble();
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
}









