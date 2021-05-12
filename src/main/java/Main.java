/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Randy Reyna
 */
public class Main {

    public static String cleanEmail(String email) {
        int index_arroba = email.indexOf("@");
        String clean_email = "";
        if (index_arroba != -1) {
            String first = email.substring(0, index_arroba);
            Pattern pattern_first = Pattern.compile("([_A-Za-z0-9+]+(\\.[_A-Za-z0-9-]+)*)");
            Matcher match_first = pattern_first.matcher(first);
            while (match_first.find()) {
                int start = match_first.start();
                int end = match_first.end();
                clean_email += first.substring(start, end);
            }
            clean_email += "@";
             String secund = email.substring(index_arroba + 1, email.length());
             Pattern pattern_sec = Pattern.compile("([A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})*)");
             Matcher match_sec = pattern_sec.matcher(secund);
             while (match_sec.find()) {
                int start = match_sec.start();
                int end = match_sec.end();
                clean_email += secund.substring(start, end);
            }
        }
        return clean_email;
    }

    public static void main(String[] args) {

        // Patrón para validar el email
        String email = "ra2'n#dy.re3y na@umc&c.cu";
        String regex_email = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex_email);
        Matcher mather = pattern.matcher(email);
        if (!mather.find()) {
            email = cleanEmail(email);
        }
        
        // Patrón para validar el nombre
        String nombre = "Randy Reyna";
        String regex_name = "^([А-Я]{1}[а-яё]{1,23})?((\\s)[А-Я]{1}[а-яё]{1,23})?((\\s)[А-Я]{1}[а-яё]{1,23})?$";
        
        // Patrón para validar la edad
        String edad = "23";
        String regex_age = "^([1-9]|120|1[0-9]|[2-9][0-9])$";
        
        // Patrón para validar el numero
        String numero = "+7 (999) 1111111";
        String regex_numer = "^\\+\\d{1,3}\\s?\\(\\d{3}\\)\\s?\\d{3}([-\\s]\\d{2}){2}$";
        
        System.out.print(nombre + "|" + edad + "|" + email + "|" + numero);
    }

}
