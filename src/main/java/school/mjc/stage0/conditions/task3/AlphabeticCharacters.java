package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int a = character;
        if((a >= 65 && a <=90) || (a >= 97 && a <= 122)){
            if(character == 'a' || character == 'o' || character == 'e' || character == 'u' || character == 'i' ){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
