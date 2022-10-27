import java.util.Scanner;

public class StringCompare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String first = sc.nextLine();
        System.out.println("Enter the second string : ");
        String second = sc.nextLine();
        System.out.println("The result is "+ check(first,second));
    }
    public static boolean check(String first, String second){
        if(second.length() > first.length())
            return false;
        if(second.isEmpty())
            return true;
        for(int i = 0; i < second.length(); i++){
            if(!first.contains(String.valueOf(second.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}

