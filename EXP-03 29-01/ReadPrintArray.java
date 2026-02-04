import java.util.Scanner;
class ReadPrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
