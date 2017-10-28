	//@formatter:on
import java.io.Serializable;

	public class Workers implements Serializable {
		private String name;
		private double stazh;
		private String dolzhnost;
		private double stavka;
		private static final double koef = 0.15;

		public Workers(String name, double stazh, String dolzhnost, double stavka) {
			this.name = name;
			this.stazh = stazh;
			this.dolzhnost = dolzhnost;
			this.stavka = stavka;
		}

		private double getMoney() throws MyException {
			if (stavka <=0)
				throw new MyException();
			return stavka + stavka * (koef * stazh);
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
			} catch (MyException e){
				e.printStackTrace();
				System.exit(1);
			}
			return " \n Разработчик: " +
					"\n Имя: " + name  +
					"\n Стаж: " + stazh +
					"\n Должность: " + dolzhnost +
					"\n Зарплата: " + money;	}
}
