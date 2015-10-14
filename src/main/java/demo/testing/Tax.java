package demo.testing;

public class Tax {

	private static final int MIN_SALARY = 150000;

	double[] salaryStep = { 150000, 200000, 250000, 250000, 1000000, 2000000 };

	double[] taxStep = { 0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35 };

	public double compute(double income) {
		double summaryTax = 0;
		if (income > MIN_SALARY) {
			summaryTax = calculateTax(income - MIN_SALARY, 0);
		}
		return summaryTax;
	}

	private double calculateTax(double remainIncome, int row) {
		if (row == 6) {
			return remainIncome * taxStep[row];
		} else {
			if (remainIncome - salaryStep[row] < 0)
				return remainIncome * taxStep[row];
			return (salaryStep[row] * taxStep[row]) + calculateTax(remainIncome - salaryStep[row], row + 1);
		}
	}

}
