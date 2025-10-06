package word_counter;

import java.util.Scanner;

public class Word_Counter {

    Scanner sc = new Scanner(System.in);
    String sentence;
    String[] words;

    public void input_Sentence() {
        System.out.println("Enter Sentence!");
        sentence = sc.nextLine();
    }

    public void word_List() {
        words = sentence.toLowerCase().split(" ");
    }

    public void counter() {
        for (int i = 0; i < words.length; i++) {
            String current_Word = words[i];
            int count = 0;
            boolean word_Counted = false;

            for (int j = 0; j < i; j++){
               if (words[j].equals(current_Word)) { //words[0].equals(words[1])
                    word_Counted = true;
                    break;
                }
            }
            if (!word_Counted) {
                for (String word : words) {
                    if (word.equals(current_Word)) {
                        count++;
                    }
                }
                System.out.println(current_Word + " : " + count);
            }
        }
    }




    
}