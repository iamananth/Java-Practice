import java.util.Scanner;

public class FreqString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Checking......");

        int[] freq = new int[str.length()];
        char[] arr = str.toCharArray();

        for(int i =0; i < str.length(); i++){
            freq[i] = 1;
            for(int j = i+1; j < str.length(); j++){
                if(arr[i] == arr[j]){
                    freq[i]++;

                    arr[j] = '0';
                }
            }
        }
        System.out.println("Frequencies of characters are : ");
        for(int i = 0; i < freq.length; i++){
            System.out.println(arr[i]+"-"+freq[i]);
        }
    }
}
