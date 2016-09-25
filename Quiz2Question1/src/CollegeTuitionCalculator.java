
public class CollegeTuitionCalculator {

	public static void main(String[] args) {
		// the average tuition increase is 2.9 percent at public universities
		double Year1 = 12342;
		double Year2 = Year1 * 1.029;
		double Year3 = Year2 * 1.029;
		double Year4 = Year3 * 1.029;
		double sum = Year1 + Year2 + Year3 + Year4;
		System.out.printf("The total cost of tuition will be $%.2f", sum);
	}
	
}