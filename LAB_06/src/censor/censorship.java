/*Utwórz metodę przyjmującą dowolną ilość argumentów typu String oraz pojedynczy argument typu int 
(pamiętaj o zachowaniu odpowiedniej kolejności w deklaracji -> patrz slajdy) 
i zwracającą wynik wpostaci String. Niech argument typu int definiuje co n-te elementy, 
które zostaną usunięte np. przy użyciu argumentu int z wartością 2 spodziewamy się, 
że metoda usunie co drugie słowo z zadanego tekstu, 
tj :„Ala”, „nie”, „ma”, „test” , kota i”,  „psa”,„papugę”2 -> „Ala ma kota i papugę” 
2-gie i czwarte argumenty zostały usunięte*/
package censor;

import java.util.Arrays; 
public class censorship {
    private String[] date;
    private int number1;

    censorship()
    {
        this.date = date;
        this.number1 = number1;
    }

    
    public String delete(int number1, String... date) {
        System.out.println("Original sentence: " + Arrays.toString(date));
        int delete = number1 - 1;
        for(int i = 0; i < date.length; i++) {
            if(delete >= date.length)
                break;
            if(date[delete] != null) {
                date[delete] = "";
            }
            delete = delete + number1;
        }
        System.out.println("New sentence: " + Arrays.toString(date));
        return "";
    }
}
