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
			}
			return " \n Разработчик: " +
					"\n Имя: " + name  +
					"\n Стаж: " + stazh +
					"\n Должность: " + dolzhnost +
					"\n Зарплата: " + money;	}
}
