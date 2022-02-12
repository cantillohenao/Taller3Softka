package library;

import library.OrderYear;
import library.InfoLibrary;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
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
        int opcionPlayList;

        ArrayList<InfoLibrary> myLibrary = new ArrayList<>();
        InfoLibrary s1 = new InfoLibrary(1, "one", "metallica", 1998, 1.11f, "metal",
                "And Justice for All.jpg", "Cancion 2 del album memories");
        myLibrary.add(s1);
        InfoLibrary s2 = new InfoLibrary(2, "Lose Yourself", "Eminem", 2002, 1.11f, "Rap",
                "8 Mile.jpg", "Cancion 1 del album 8 Mile");
        myLibrary.add(s2);
        InfoLibrary s3 = new InfoLibrary(3, "situation", "escape the fate", 2008, 3.12f, "rock",
                "DyingIsYourLatestFashion.jpg", "Cancion 3 del album memories");
        myLibrary.add(s3);
        InfoLibrary s4 = new InfoLibrary(4, "Dance macabre", "ghost", 2018, 4.20f, "punk",
                "prequelle.jpg", "Cancion 4 del album memories");
        myLibrary.add(s4);
        InfoLibrary s5 = new InfoLibrary(5, "Psychosocial", "slipknot", 2008, 4.11f, "metal",
                "AllHopeIsGone.jpg", "Cancion 4 del album memories");
        myLibrary.add(s5);
        String[] genderList = {"rock", "punk", "metal", "Rap"};

        ArrayList<InfoLibrary> myPlay = new ArrayList<>();

        System.out.println("Que deseas hacer? 1) crear playlist 2)filtrar canciones "
                + "de la lista de reproduccion completa. 3) organizar lista de mayor a menor "
                + "4) mostrar libreria completa" + "\n" + " Ingresa el numero de la opcion ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(myLibrary);
                System.out.println("selecciona ID de la cancion");
                opcionPlayList = scanner.nextInt();
                myPlay.add(myLibrary.get(opcionPlayList - 1));
                System.out.println(myLibrary);
                System.out.println("selecciona ID de la cancion o muestra playlist nueva");
                opcionPlayList = scanner.nextInt();
                myPlay.add(myLibrary.get(opcionPlayList - 1));
                System.out.println(myPlay);

                break;
            case 2:
                System.out.println("Que tipo de filtro deseas: 1) por año "
                        + "2) por genero musical." + "\n" + " Ingresa el numero de la opcion.");
                int opcionFilter;
                opcionFilter = scanner.nextInt();
                if (opcionFilter == 1) {
                    System.out.println("De que año deseas traer musica? "
                            + "\n" + " Ingresa el numero el año. desde 2000 hasta 2022");
                    opcionYear = scanner.nextInt();
                    myLibrary.stream().filter(l -> l.getYear() == opcionYear).forEach(System.out::println);
                } else if (opcionFilter == 2) {
                    System.out.println("Que genero deseas filtrar: 1)rock 2)punk 3) metal. "
                            + "\n" + " Ingresa el numero correspondiente");
                    opcionGender = scanner.nextInt();
                    myLibrary.stream().filter(l -> l.getGender() == genderList[opcionGender - 1]).forEach(System.out::println);
                }
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
                            Collections.sort(myLibrary);
                            for (Info elem : myLibrary) {
                                System.out.println(elem);
                            }
                            break;
                        case 2:
                            Collections.sort(myLibrary, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elem : myLibrary) {
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
                            Collections.sort(myLibrary, new OrderYear());
                            for (Info year : myLibrary) {
                                System.out.println(year);
                            }
                            break;
                        case 2:
                            Collections.sort(myLibrary, Collections.reverseOrder()); // mayor a menor duracion
                            for (Info elem : myLibrary) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }

                }
            case 4:
                System.out.println(myLibrary);
        }
    }
}