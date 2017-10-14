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

		for (int i = 0; i < nomber; i++) {
			System.out.print("Введен " + (i + 1) + "-й рабочий" + " ФИО: ");
			String name = sc.next();
			System.out.print("Введен " + (i + 1) + "-й рабочий" + " Стаж: ");
			float stazh = sc.nextFloat();
			System.out.print("Введен " + (i + 1) + "-й рабочий" + " Должность: ");
			String dolzhnost = sc.next();
			Workers work = new Workers(name, stazh, dolzhnost);
			spisok.add(work);
		}

			File myFile = new File("D:\\workers.txt");

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

			System.out.println("Информация записана");
			System.out.println("Загрузка");

			try {
				FileInputStream fileInput = new FileInputStream(myFile);
				ObjectInputStream objectIn = new ObjectInputStream(fileInput);
				ArrayList<Workers> spisok2 = (ArrayList<Workers>)objectIn.readObject();
				for (int i = 0; i < nomber; i++) {
					System.out.print(spisok2.get(i).toString());
				}
				objectIn.close();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}



