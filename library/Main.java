package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JUANES
 */
public class Main {

    public static void main(String[] args) {
        List<Info> infoList = new ArrayList<>();
        infoList.add(new Info("muse", "paradise", 1, 2015, 2.11f, "reggae", "memories.jpg", "Cancion 1 del album memories"));
        infoList.add(new Info("metallica", "resistance", 2, 2015, 1.11f, "reggae", "memories.jpg", "Cancion 2 del album memories"));
        infoList.add(new Info("lamda", "madness", 3, 2003, 3.12f, "rock", "memories.jpg", "Cancion 3 del album memories"));
        infoList.add(new Info("muse", "knights", 4, 2001, 4.11f, "punk", "memories.jpg", "Cancion 4 del album memories"));
        infoList.add(new Info("muse", "knights", 4, 2001, 4.11f, "jazz", "memories.jpg", "Cancion 4 del album memories"));
        String[] genderList = {"rock", "punk", "jazz", "reggae"};

        int opcion1;
        Scanner scanner = new Scanner(System.in);
        int opcion2;
//        System.out.println("De que año deseas traer musica? Ingresa el numero el año. desde 2000 hasta 2022");
//        opcion1 = scanner.nextInt(); 
//        infoList.stream().filter(l -> l.getYear() == opcion1).forEach(System.out::println);
//        System.out.println("****************");
        
        System.out.println("Que genero deseas filtrar: 1)rock 2)punk 3) jazz 4)reggae. Ingresa el numero correspondiente");
        opcion2 = scanner.nextInt();
        infoList.stream().filter(l -> l.getGender() == genderList[opcion2 - 1]).forEach(System.out::println);

//        int opcion3;
//
//        Collections.sort(infoList);
//        for (Info elemento : infoList) {
//            System.out.println(elemento);
//
//        }
//
//        System.out.println("****************");
//
//        Collections.sort(infoList, Collections.reverseOrder()); // mayor a menor duracion
//        for (Info elemento : infoList) {
//            System.out.println(elemento);
//        }

    }
}