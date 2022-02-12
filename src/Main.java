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
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcionGender;
        int opcionYear;
        int opcionOrder;
        int opcionOderderMajor;
        int opcionOrderDate;

        List<Info> infoList = new ArrayList<>();
        infoList.add(new Info("muse", "paradise", 1, 2015, 2.11f, "reggae", "memories.jpg", "Cancion 1 del album memories"));
        infoList.add(new Info("metallica", "resistance", 2, 2015, 1.11f, "reggae", "memories.jpg", "Cancion 2 del album memories"));
        infoList.add(new Info("lamda", "madness", 3, 2003, 3.12f, "rock", "memories.jpg", "Cancion 3 del album memories"));
        infoList.add(new Info("muse", "knights", 4, 2001, 4.20f, "punk", "memories.jpg", "Cancion 4 del album memories"));
        infoList.add(new Info("muse", "Panic Station", 4, 2001, 4.11f, "jazz", "memories.jpg", "Cancion 4 del album memories"));
        String[] genderList = {"rock", "punk", "jazz", "reggae"};

        System.out.println("Que deseas hacer? 1) crear playlist 2)filtrar canciones de la lista de reproduccion completa. 3) organizar lista de mayor a menor Ingresa el numero de la opcion ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("hola");
                break;
            case 2:
                System.out.println("Que tipo de filtro deseas: 1) por año 2) por genero musical. Ingresa el numero de la opcion.");
                int opcionFilter;
                opcionFilter = scanner.nextInt();
                if (opcionFilter == 1) {
                    System.out.println("De que año deseas traer musica? Ingresa el numero el año. desde 2000 hasta 2022");
                    opcionYear = scanner.nextInt();
                    infoList.stream().filter(l -> l.getYear() == opcionYear).forEach(System.out::println);
                } else if (opcionFilter == 2) {
                    System.out.println("Que genero deseas filtrar: 1)rock 2)punk 3) jazz 4)reggae. Ingresa el numero correspondiente");
                    opcionGender = scanner.nextInt();
                    infoList.stream().filter(l -> l.getGender() == genderList[opcionGender - 1]).forEach(System.out::println);
                }
                break;
            case 3:
                System.out.println("Desear organizar por: 1) duracion de la cancion 2) fecha Ingresa el numero correspondiente");
                opcionOrder = scanner.nextInt();
                if (opcionOrder == 1) {
                    System.out.println("Desear organizar de: 1)Por menor duracion de la cancion 2)Por mayor duracion de la cancion. Ingresa el numero correspondiente");
                    opcionOderderMajor = scanner.nextInt();
                    switch (opcionOderderMajor) {
                        case 1:
                            Collections.sort(infoList);
                            for (Info elemento : infoList) {
                                System.out.println(elemento);
                            }
                            break;
                        case 2:
                            Collections.sort(infoList, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elemento : infoList) {
                                System.out.println(elemento);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }
                } else if (opcionOrder == 2) {
                    System.out.println("Desear organizar de: 1)Por fecha mas antigua 2)Por fecha mas actual. Ingresa el numero correspondiente");
                    opcionOrderDate = scanner.nextInt();
                    switch (opcionOrderDate) {
                        case 1:
                            Collections.sort(infoList);
                            for (Info elemento : infoList) {
                                System.out.println(elemento);
                            }
                            break;
                        case 2:
                            Collections.sort(infoList, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elemento : infoList) {
                                System.out.println(elemento);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }

                }
        }
    }
}
