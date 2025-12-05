package in.com;

public class SecondLargest {

    public static void secondHighest(int arr[]) {

        int flarge = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for (int no : arr) {

            if (no > flarge) {
                slarge = flarge;  // second largest becomes old largest
                flarge = no;      // new largest
            } 
            else if (no > slarge && no != flarge) {
                slarge = no;      // update second largest
            }
        }

        System.out.println("Largest: " + flarge);
        System.out.println("Second Largest: " + slarge);
    }

    public static void main(String[] args) {

        int arr[] = {1, 10, 20, 3, 30};
        secondHighest(arr);

    }
}
