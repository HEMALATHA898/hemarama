import java.util.*;
class PalindromeTester {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String MyString = in.nextLine();


        Queue<Character> queue = new LinkedList<Character>();

        for(int i=0; i<MyString.length(); i++){
            queue.add(MyString.charAt(i));
        }

        String Mystr2 = "";
        System.out.println("String to Queue by letters");
        while( queue.peek() != null ) {
           Mystr2 = Mystr2 + queue.remove();
            System.out.println(Mystr2);
        }
        //System.out.println(str2);
        Stack stack = new Stack();
        System.out.println("\nString to Stack by letters");
        for (int i = 0; i < MyString.length(); i++) {
            stack.push(MyString.charAt(i));

        }

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
            System.out.println(reverseString);
        }

        if (MyString.equals(reverseString) && MyString.equals(Mystr2))
            System.out.println("\n\nThe input String is a palindrome.");
        else
            System.out.println("\n\nThe input String is not a palindrome.");

    }
}
