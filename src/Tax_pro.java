
public class Tax_pro {

	private int salary = 0;

	public double tax(int salary) {
		Tax_pro tx = new Tax_pro();

		if (tx.salary < 1000000) {
			return 0.05;
		} else if (tx.salary >= 1000000 & tx.salary < 2000000) {
			return 0.10;
		} else if (tx.salary >= 2000000 & tx.salary < 3000000) {
			return 0.15;
		} else if (tx.salary >= 3000000 & tx.salary < 4000000) {
			return 0.20;
		} else {
			return 0.25;
		}
	}
}
