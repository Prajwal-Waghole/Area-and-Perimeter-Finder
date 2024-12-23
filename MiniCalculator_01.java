

import java.util.Scanner;

class Square {
    float side;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to find? Select 1 for area or 2 for perimeter: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            float area = side * side;
            System.out.println("The area of the square is: " + area);
        } else {
            float perimeter = 4 * side;
            System.out.println("The perimeter of the square is: " + perimeter);
        }
    }
}

class Circle {
    float radius;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to find? Select 1 for area or 2 for perimeter: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            float area = 3.14f * (radius * radius);
            System.out.println("The area of the circle is: " + area);
        } else {
            float perimeter = 2 * 3.14f * radius;
            System.out.println("The perimeter of the circle is: " + perimeter);
        }
    }
}

class Rectangle {
    float side1, side2;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to find? Select 1 for area or 2 for perimeter: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            float area = side1 * side2;
            System.out.println("The area of the rectangle is: " + area);
        } else {
            float perimeter = 2 * (side1 + side2);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }
}

class Triangle {
    float side1, side2, side3, length, base;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to find? Select 1 for area or 2 for perimeter: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Press |1| if you want to find area with length and base or |2| if you have sides: ");
            int choice1 = sc.nextInt();

            if (choice1 == 1) {
                float area = 0.5f * length * base;
                System.out.println("The area of the triangle is: " + area);
            } else {
                float s = (side1 + side2 + side3) / 2;
                double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                System.out.println("The area of the triangle is: " + area);
            }
        } else {
            float perimeter = side1 + side2 + side3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        }
    }
}

public class MiniCalculator_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Square sq = new Square();
        Rectangle rc = new Rectangle();
        Circle ci = new Circle();
        Triangle tr = new Triangle();

        System.out.println("WELCOME !!!\nWhat do you want to find: Circle, Triangle, Square, or Rectangle?");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Triangle")) {
            System.out.println("Enter the sides values:");
            tr.side1 = sc.nextFloat();
            tr.side2 = sc.nextFloat();
            tr.side3 = sc.nextFloat();
            System.out.println("Or enter the length and base values:");
            tr.length = sc.nextFloat();
            tr.base = sc.nextFloat();
            tr.get();
        } else if (choice.equalsIgnoreCase("Circle")) {
            System.out.println("Enter the radius value:");
            ci.radius = sc.nextFloat();
            ci.get();
        } else if (choice.equalsIgnoreCase("Square")) {
            System.out.println("Enter the side value:");
            sq.side = sc.nextFloat();
            sq.get();
        } else if (choice.equalsIgnoreCase("Rectangle")) {
            System.out.println("Enter the side1 and side2 values:");
            rc.side1 = sc.nextFloat();
            rc.side2 = sc.nextFloat();
            rc.get();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
