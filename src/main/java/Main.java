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
 
    public static void main(String[] args) {
 
        // Patrón para validar el email
        String regex_email = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        String regex_name = "^([А-Я]{1}[а-яё]{1,23})?((\\s)[А-Я]{1}[а-яё]{1,23})?((\\s)[А-Я]{1}[а-яё]{1,23})?$";
        
        String regex_age = "^([1-9]|120|1[0-9]|[2-9][0-9])$";
        
        String regex_numer = "^\\+\\d{1,3}\\s?\\(\\d{3}\\)\\s?\\d{3}([-\\s]\\d{2}){2}$";
        
        
        Pattern pattern = Pattern.compile(regex_numer);
 
        // El email a validar
        String email = "+7 (985) 537-89-72";
        
        Matcher mather = pattern.matcher(email);
       
        if (mather.find()) {
            System.out.println("HAY UN MATCH");
        } else {
            System.out.println("NO HAY UN MATCH");
            
        }
    }
 
}
