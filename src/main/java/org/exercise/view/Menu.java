package org.exercise.view;

import lombok.Data;
import org.exercise.model.MenuItem;
import java.util.ArrayList;
import java.util.Scanner;
@Data
public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private ArrayList<MenuItem> itemList = new ArrayList<MenuItem>();

    public void showMenu() {
        System.out.println("**** Aplicación calculadora *****");//title
        itemList.forEach((MenuItem item) -> System.out.println(String.valueOf(itemList.indexOf(item) + 1) + "." + item.getName()));//Menu items
        System.out.println(String.valueOf(itemList.size() + 1) + ".Salir");//exit option
        System.out.println("Seleccione una opción:");
    }

    private double readOperator(){
        try {
            System.out.println("Introduzca un operando:");
            double operator = Double.parseDouble(scanner.nextLine());
            return operator;
        }
        catch (NumberFormatException e){
            System.out.println("El operando debe ser un número válido");
            return readOperator();
        }
        catch (NullPointerException e){
            System.out.println("El operando no puede estar vacio");
            return readOperator();
        }
    }
    private int readMenuOption(){
        try{
            int option = Integer.parseInt(scanner.nextLine());
            if (option <= 5 && option >= 1){
                return option;
            }
        }
        catch (Exception e){
            System.out.println("La opción debe ser un número del 1 al 5");
            return readMenuOption();
        }
        return 0;
    }


}
