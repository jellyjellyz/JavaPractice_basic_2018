package class2;

public class Goldbach {
	public static boolean checkGoldbach () {
		for (int i = 4; i <= 1000; i+=2){
			if (!checkGoldForEach(i)) {
				System.out.println(i);
				return false;
			}
		}
		return true;
	}
	
	private static boolean checkGoldForEach (int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (checkPrime(i) && checkPrime(a - i)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean checkPrime (int a) {
		for (int i = 2; i < a; i++){
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}

