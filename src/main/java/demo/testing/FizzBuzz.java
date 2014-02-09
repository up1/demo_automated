package demo.testing;

public class FizzBuzz {

	public String shout(int i) {
		// TODO Auto-generated method stub
		if(i%3 == 0){
			return "Fizz";
		}else if(i%5 == 0) {
			return "Buzz";
		}else{
			return String.valueOf(i);
		}
	}

}
