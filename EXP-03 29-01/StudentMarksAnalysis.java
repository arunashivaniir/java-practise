import java.util.Scanner;

class StudentMarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;
        int highest = marks[0];
        int lowest = marks[0];
        int aboveAvg = 0, belowAvg = 0;

        for(int i = 0; i < n; i++) {
            if(marks[i] > highest)
                highest = marks[i];
            if(marks[i] < lowest)
                lowest = marks[i];

            if(marks[i] > average)
                aboveAvg++;
            else if(marks[i] < average)
                belowAvg++;
        }

        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + average);
        System.out.println("Highest marks = " + highest);
        System.out.println("Lowest marks = " + lowest);
        System.out.println("Students above average = " + aboveAvg);
        System.out.println("Students below average = " + belowAvg);
    }
}
