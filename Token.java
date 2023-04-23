import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {

    TK_MINUS ("-"), 
    TK_PLUS ("\\+"), 
    TK_MUL ("\\*"), 
    TK_DIV ("/"), 
    TK_NU ("~"), 
    TK_SI ("&"),  
    TK_SAU ("\\|"),  
    TK_MAI_PUTIN ("<"),
    TK_A ("<="),
    TK_MAI_MARE(">"),
    TK_MAI_MARE_SAU_EGAL (">="), 
    TK_EGALITATE ("=="),
    TK_PRIMESTE ("="),
    TK_DESCHIS("\\("),
    TK_INCHIS ("\\)"), 
    TK_PUNCT_VIRGULA (";"), 
    TK_COMMA (","), 
    TK_KEY_DEFINIRE("define"), 
    TK_KEY_CA ("as"),
    TK_KEY_ESTE ("is"),
    TK_KEY_DACA ("if"), 
    TK_KEY_ATUNCI ("then"), 
    TK_KEY_SAU ("else"), 
    TK_KEY_SI_SAU ("endif"),
    TK_KEY_END ("end"),
    PARANTEZA_DESCHISA ("\\{"),
    PARANTEZA_INCHISA ("\\}"),
    PARANTEZA_PATRATA_INCHISA ("\\]"),
    PARANTEZA_PATRATA_DESCHISA ("\\["),
    DIFFERENTA ("<>"),
 
    STRING ("\"[^\"]+\""),
    INTEGER ("\\d+"), 
    REAL ("(\\d*)\\.\\d+"),
    IDENTIFIER ("\\w+");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}