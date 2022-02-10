/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import library.Info;
import java.util.Comparator;

/**
 *
 * @author JUANES
 */
public class OrderYear implements Comparator<Info> {

    @Override
    public int compare(Info o1, Info o2) {
        if (o1.getYear()> o2.getYear()) {
            return -1; // es menor 
        } else if (o1.getYear() > o2.getYear()) {
            return 0; // son iguales
        } else {
            return 1; // es mayor
        }
    }
}
