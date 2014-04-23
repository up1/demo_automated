package demo.testing;

public class Tax {

	double[] salaryStep = { 150000, 200000, 250000, 250000, 1000000, 2000000 };

	double[] taxStep = { 0.05, 0.10, 0.15, 0.20, 0.25, 0.30 };

	public double compute(int income) {
		if (income > 150000) {
			return calculateTax(income - 150000, 0);
		}
		return 0;
	}

	private double calculateTax(double remainIncome, int row) {
		if (row == 6) {
			return remainIncome * 0.35;
		} else {
			if (remainIncome - salaryStep[row] < 0)
				return remainIncome * taxStep[row];
			return (salaryStep[row] * taxStep[row]) + calculateTax(remainIncome - salaryStep[row], row + 1);
		}
	}

}
