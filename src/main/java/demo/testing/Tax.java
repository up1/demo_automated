package demo.testing;

public class Tax {

	public double compute(int income) {
		if(income > 150000) {
			return (income - 150000) * (0.05);
		}
		return 0;
	}

}
