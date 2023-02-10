package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int a = symbol;
        if((a >= 65 && a <=90) || (a >= 97 && a <= 122)){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
