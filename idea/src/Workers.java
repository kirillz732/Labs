	//@formatter:on
import java.io.Serializable;

	public class Workers implements Serializable {
		private String name;
		private float stazh;
		private String dolzhnost;
		private static final int stavka = 450;
		private static final float koef = 0.15f;

		public Workers(String name, float stazh, String dolzhnost) {
			this.name = name;
			this.stazh = stazh;
			this.dolzhnost = dolzhnost;
		}

		private float getMoney() {
			return stavka + stavka * (koef * stazh);
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setStazh(float stazh) {
			this.stazh = stazh;
		}

		public void setDolzhost(String dolzhost) {
			this.dolzhnost = dolzhost;
		}

		public String getName() {
			return name;
		}

		public float getStazh() {
			return stazh;
		}

		public String getDolzhost() {
			return dolzhnost;
		}

		@Override
		public String toString() {
			return "Workers" +
					"name:" + name  +
					"stazh: " + stazh +
					"dolzhnost:'" + dolzhnost +
					"zarplata:" + getMoney();	}
}
