import java.text.Format;

public class Try {

    public static void main(String[] args) {

        Lexer lexer = new Lexer("C:/Users/Input.txt");
        System.out.println("Analiza Lexicala");
        System.out.println("-----------------");
    
        while (!lexer.isExausthed()) {
            System.out.printf("%-18s :  %s \n",lexer.currentLexema() , lexer.currentToken());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Yay! Am reusit! :D");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
    

