package org.exercise;

import org.exercise.model.MenuItem;
import org.exercise.view.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        items.add(new MenuItem("Suma", (op1, op2)-> System.out.println("Suma")));
        items.add(new MenuItem("Resta", (op1, op2)-> System.out.println("Resta")));
        items.add(new MenuItem("Multiplicación", (op1, op2)-> System.out.println("Multiplicación")));
        items.add(new MenuItem("División", (op1, op2)-> System.out.println("División")));
        menu.setItemList(items);
        menu.showMenu();
    }

}