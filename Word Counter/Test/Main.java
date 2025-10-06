package Test;

import word_counter.Word_Counter;

public class Main {
    public static void main(String[] args) {
        
         Word_Counter wordsObj = new Word_Counter();
        wordsObj.input_Sentence();
        wordsObj.word_List();
        wordsObj.counter();

    }
    
}