package entityclassassignment2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 55000);
        Product p2 = new Product(202, "Mouse", 500);
        Product p3 = new Product(203, "Keyboard", 1200);
        Product p4 = new Product(204, "Monitor", 10000);

        System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

