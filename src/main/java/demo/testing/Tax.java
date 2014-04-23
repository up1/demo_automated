package demo.testing;

public class Tax {

	public double compute(int income) {
		if(income > 300000) {
			income = income - 150000;
			if(income > 150000) {
				return  7500 +  (income - 150000) * (0.10);
			} 
		}
		if(income > 150000) {
			return (income - 150000) * (0.05);
		}
		return 0;
	}

}
