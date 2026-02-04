import java.util.Scanner;
class StudentMarksAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] marks = new int[n];
		int total = 0;

		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
			total += marks[i];
		}

		double avg = (double) total / n;
		int high = marks[0];
		int low = marks[0];
		int above = 0, below = 0;

		for (int i = 0; i < n; i++) {
			if (marks[i] > high) {
				high = marks[i];
			}
			if (marks[i] < low) {
				low = marks[i];
			}
			if (marks[i] > avg) {
				above++;
			} else if (marks[i] < avg) {
				below++;
			}
		}

		System.out.println(total);
		System.out.println(avg);
		System.out.println(high);
		System.out.println(low);
		System.out.println(above);
		System.out.println(below);

		sc.close();
	}
}

