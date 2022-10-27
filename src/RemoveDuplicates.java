import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String res = removeDuplicateChar(str);
        System.out.println(res);
    }

    public static String removeDuplicateChar(String str) {
        char[] arr = str.toCharArray();
        String target = "";
        for(char val : arr)
        {
            if(target.indexOf(val) == -1){
                target += val;
            }
        }
        return target;
    }
}
