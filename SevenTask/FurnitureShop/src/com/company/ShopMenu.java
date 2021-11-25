package com.company;

import java.util.Scanner;
import java.util.Vector;

public class ShopMenu {
    private Vector<Furniture> cart = new Vector(0);
    private int cash = 0;

    public int getCash() {
        return cash;
    }

    public Vector getCart() {
        return cart;
    }

    public void menu() {
        int point = 0;

        while (point != 4) {

            System.out.println("=++= Point of the menu =++=");
            System.out.println("1 - Add in wishlist");
            System.out.println("2 - Remove from wishlist");
            System.out.println("3 - Total price");

            Scanner scanner = new Scanner(System.in);
            point = scanner.nextInt();

            switch (point) {
                case 1:
                    addCart();
                    break;
                case 2:
                    remCart();
                    break;
                case 3:
                    System.out.println(cash);
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    break;
            }
        }
    }

    private void remCart() {

        System.out.println();
        System.out.println("Delete something from the wishlist: ");

        if (cart.size() != 0) {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(Integer.toString(i + 1) + ") " + cart.elementAt(i));
            }

            Scanner scanner = new Scanner(System.in);
            cart.remove(scanner.nextInt() - 1);
            cash -= cart.lastElement().getPrice();

        } else {
            System.out.println("... Empty ...");
        }
        System.out.println();
    }

    private void addCart() {

        int point = 0;
        int color, size, material;

        System.out.println();
        System.out.println("=++= Chose the product =++=");
        System.out.println("1 - Bed");
        System.out.println("2 - Table");
        System.out.println("3 - Shelf");

        Scanner scanner = new Scanner(System.in);

        point = scanner.nextInt();

        System.out.println();
        System.out.print("Set color: ");
        color = scanner.nextInt();

        System.out.print("Set size: ");
        size = scanner.nextInt();

        System.out.print("Material: ");
        material = scanner.nextInt();

        switch (point) {
            case 1:
                System.out.print("Type of strings and legs ( write int number ): ");
                cart.addElement(new Bed(color, size, material, scanner.nextInt(), scanner.nextInt()));
                break;
            case 2:
                System.out.print("Count and type of legs and height of the table ( write int number ): ");
                cart.addElement(new Table(color, size, material, scanner.nextInt(),
                        scanner.nextInt(), scanner.nextInt()));
                break;
            case 3:
                System.out.print("Bind and style of shelf ( write int number ): ");
                cart.addElement(new Shelf(color, size, material, scanner.nextInt(), scanner.nextInt()));
                break;
            default:
                System.out.println();
                break;
        }

        cash += cart.lastElement().getPrice();
        System.out.println();
    }

    @Override
    public String toString() {
        return "FurnitureShop: -> " + "| Cart: |" + cart + "| Cash: |" + cash + "| <- ";
    }
}