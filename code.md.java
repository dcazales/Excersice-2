import java.util.Scanner;
public class CazalesCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Int letterCount;
        String letter;
        char ch;
        int letters;
        
        int [] count = new int[26];
        for (int i=0; i<26; i++){
        counts[i]=0;
        }
        
        
        System.out.printIn("This program analyze text entered by the user to see which characters appear most frequently. It prints a list of the five most refuently occuring lletters in the text.)" ;
        System.out.print("Enter a line of text to analyze:");
        letterCount = sc.nextInt();
        letterCount = text.toUpperCase();
        char[] letters = str.toCharArray();
        char[]letters = str.toCharArray();
        
        
        for (int i=0;i < str.length();i++); { 
        	Letters[i] = (int)(Letters[i]+1); 
        	
       	}
       	for (int i = 0; i < 26; i++){
       	ch=(char)(i+65) { 
       	System.out.printf("Here are the letter frequencies:%c %d\n" ch, counts[i]);
		
		System.out.printf("Want to run the analysis again with a different line (Y or N)?");
		choice = sc.nextLine();
		choice= choice.toUpperCase();
	}While (choice.equals("Y"));
	System.out.printIn("Thanks for using this program.")

	}
}
