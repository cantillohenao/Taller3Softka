package library;

import library.OrderYear;
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
        int optionOderderMajor;
        int opcionOrderDate;
        List<Info> infoList = new ArrayList<>();
        infoList.add(new Info("muse", "survival", 1, 2015, 2.11f,
                "rock", "the2ndlaw.jpg", "Cancion 1 del album memories") );
        infoList.add(new Info("metallica", "one", 2, 2015, 1.11f,
                "metal", "And Justice for All.jpg", "Cancion 2 del album memories"));
        infoList.add(new Info("escape the fate", "situation", 3, 2003, 3.12f,
                "rock", "DyingIsYourLatestFashion.jpg", "Cancion 3 del album memories"));
        infoList.add(new Info("ghost", "Dance macabre", 4, 2001, 4.20f,
                "punk", "prequelle.jpg", "Cancion 4 del album memories"));
        infoList.add(new Info("slipknot", "Psychosocial", 4, 2001, 4.11f,
                "metal", "AllHopeIsGone.jpg", "Cancion 4 del album memories"));
        String[] genderList = {"rock", "punk", "metal"};

        System.out.println("Que deseas hacer? 1) crear playlist 2)filtrar canciones "
                + "de la lista de reproduccion completa. 3) organizar lista de mayor a menor " + "\n" + " Ingresa el numero de la opcion ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("hola");
                break;
            case 2:
                System.out.println("Que tipo de filtro deseas: 1) por año "
                        + "2) por genero musical." + "\n" + " Ingresa el numero de la opcion.");
                int opcionFilter;
                opcionFilter = scanner.nextInt();
                if (opcionFilter == 1) {
                    System.out.println("De que año deseas traer musica? " + "\n" + " Ingresa el numero el año. desde 2000 hasta 2022");
                    opcionYear = scanner.nextInt();
                    infoList.stream().filter(l -> l.getYear() == opcionYear).forEach(System.out::println);
                } else if (opcionFilter == 2) {
                    System.out.println("Que genero deseas filtrar: 1)rock 2)punk 3) metal. " + "\n" + " Ingresa el numero correspondiente");
                    opcionGender = scanner.nextInt();
                    infoList.stream().filter(l -> l.getGender() == genderList[opcionGender - 1]).forEach(System.out::println);
                }
                break;
            case 3:
                System.out.println("Desear organizar por: 1) duracion de la cancion "
                        + "2) fecha. " + "\n" + " Ingresa el numero correspondiente");
                opcionOrder = scanner.nextInt();
                if (opcionOrder == 1) {
                    System.out.println("Desear organizar de: 1)Por menor duracion de la cancion "
                            + "2)Por mayor duracion de la cancion. " + "\n" + " Ingresa el numero correspondiente");
                    optionOderderMajor = scanner.nextInt();
                    switch (optionOderderMajor) {
                        case 1:
                            Collections.sort(infoList);
                            for (Info elem : infoList) {
                                System.out.println(elem);
                            }
                            break;
                        case 2:
                            Collections.sort(infoList, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elem : infoList) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }
                } else if (opcionOrder == 2) {
                    System.out.println("Desear organizar de: 1)Por fecha mas actual  "
                            + "2)Por fecha mas antigua." + "\n" + " Ingresa el numero correspondiente");
                    opcionOrderDate = scanner.nextInt();
                    switch (opcionOrderDate) {
                        case 1:
                                Collections.sort(infoList, new OrderYear());
                            for (Info year : infoList) {
                                System.out.println(year);
                            }
                            break;
                        case 2:
                            Collections.sort(infoList, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elem : infoList) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }

                }
        }
    }
}
