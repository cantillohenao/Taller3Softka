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
 * [la clase Main sera la clase principal donde efectuamos la aplicacion de la
 * libreria]
 *
 *
 * @version [1.0.000 2022-02-10]
 *
 * @author [Juan Esteban, Velasquez Posada ], [Juan Camilo, Cantillo Henao]
 *
 * @since [1.0.000 2022-02-10]
 *
 */
public class Main {

    public static void main(String[] args) {
        /**
         * declaracion de variables e instancia de metodo Scanner
         *
         */
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int optionGender;
        int optionYear;
        int optionOrder;
        int optionOderderMajor;
        int optionOrderDate;
        int optionPlayList;
        int optionGetSong;
        /**
         * Se crea array para almacenar libreria principal
         */
        ArrayList<InfoLibrary> myLibrary = new ArrayList<>();
        InfoLibrary s1 = new InfoLibrary(1, "one", "metallica", 1998, 1.11f, "metal",
                "And Justice for All.jpg", "Cancion 1 del album And Justice for All");
        myLibrary.add(s1);
        InfoLibrary s2 = new InfoLibrary(2, "Lose Yourself", "Eminem", 2002, 1.11f, "Rap",
                "8Mile.jpg", "Cancion 1 del album 8 Mile");
        myLibrary.add(s2);
        InfoLibrary s3 = new InfoLibrary(3, "situation", "escape the fate", 2008, 3.12f, "rock",
                "DyingIsYourLatestFashion.jpg", "Cancion 3 del album DyingIsYourLatestFashion");
        myLibrary.add(s3);
        InfoLibrary s4 = new InfoLibrary(4, "Dance macabre", "ghost", 2018, 4.20f, "punk",
                "prequelle.jpg", "Cancion 3 del album prequelle");
        myLibrary.add(s4);
        InfoLibrary s5 = new InfoLibrary(5, "Psychosocial", "slipknot", 2008, 4.11f, "metal",
                "AllHopeIsGone.jpg", "Cancion 4 del album AllHopeIsGone");
        myLibrary.add(s5);
        String[] genderList = {"rock", "punk", "metal", "Rap"};

        /**
         * se crea nuevo array para almacenar la playlist personalizada
         */
        ArrayList<InfoLibrary> myPlay = new ArrayList<>();

        System.out.println("Que deseas hacer? 1) crear playlist 2)filtrar canciones "
                + "de la lista de reproduccion completa. 3) organizar lista de mayor a menor "
                + "4) mostrar libreria completa" + "\n" + " Ingresa el numero de la opcion ");
        opcion = scanner.nextInt();

        /**
         * Se crea un interruptor para evaluar cada uno de los casos
         */
        switch (opcion) {
            /**
             * El caso 1 se implemento para crear una playlist
             */
            case 1:
                System.out.println(myLibrary);
                do {
                    System.out.println("selecciona ID de la cancion a agregar a la playlist");
                    optionPlayList = scanner.nextInt();
                    myPlay.add(myLibrary.get(optionPlayList - 1));
                    System.out.println("¿Que desear hacer ahora?");
                    System.out.println(" 1) Agregar otra cancion a la playlist 2) Mostrar playlist" + "\n" + "Ingresa el numero de la opcion");
                    optionGetSong = scanner.nextInt();
                } while (optionGetSong <= 1);
                System.out.println(myPlay);
                break;
            /**
             * El caso 2 se implemento para filtar las canciones de la libreria principal
             */
            case 2:
                System.out.println("Que tipo de filtro deseas: 1) por año "
                        + "2) por genero musical." + "\n" + " Ingresa el numero de la opcion.");
                int opcionFilter;
                opcionFilter = scanner.nextInt();
                if (opcionFilter == 1) {
                    System.out.println("De que año deseas traer musica? "
                            + "\n" + " Ingresa el numero el año. desde 2000 hasta 2022");
                    optionYear = scanner.nextInt();
                    myLibrary.stream().filter(l
                            -> l.getYear() == optionYear).forEach(System.out::println);
                } else if (opcionFilter == 2) {
                    System.out.println("Que genero deseas filtrar: 1)rock 2)punk 3) metal. "
                            + "\n" + " Ingresa el numero correspondiente");
                    optionGender = scanner.nextInt();
                    myLibrary.stream().filter(l
                            -> l.getGender() == genderList[optionGender - 1]).forEach(System.out::println);
                }

            /**
            * El caso 3 se implemento para organizar las canciones por duracion o por fecha
            */
            case 3:
                System.out.println("Desear organizar por: 1) duracion de la cancion "
                        + "2) fecha. " + "\n" + " Ingresa el numero correspondiente");
                optionOrder = scanner.nextInt();
                if (optionOrder == 1) {
                    System.out.println("Desear organizar de: 1)Por menor duracion de la cancion "
                            + "2)Por mayor duracion de la cancion. " + "\n" + " Ingresa el numero correspondiente");
                    optionOderderMajor = scanner.nextInt();
                    switch (optionOderderMajor) {
                        case 1:
                            Collections.sort(myLibrary); // Se organiza de menor a  mayor  duracion
                            for (Info elem : myLibrary) {
                                System.out.println(elem);
                            }
                            break;
                        case 2:
                            Collections.sort(myLibrary, Collections.reverseOrder()); // Se organiza de mayor a menor duracion
                            for (Info elem : myLibrary) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }
                } else if (optionOrder == 2) {
                    System.out.println("Desear organizar de: 1)Por fecha mas actual  "
                            + "2)Por fecha mas antigua." + "\n" + " Ingresa el numero correspondiente");
                    optionOrderDate = scanner.nextInt();
                    switch (optionOrderDate) {
                        case 1:
                            Collections.sort(myLibrary, new OrderYear()); //Se organiza de menor a  mayor  duracion
                            for (Info year : myLibrary) {
                                System.out.println(year);
                            }
                            break;
                        case 2:
                            Collections.sort(myLibrary, Collections.reverseOrder()); // Se organiza de mayor a menor duracion
                            for (Info elem : myLibrary) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                    }

                }
            /**
            * El caso 4 muestra la libreria completa
            */
            case 4:
                System.out.println(myLibrary);
        }
    }
}