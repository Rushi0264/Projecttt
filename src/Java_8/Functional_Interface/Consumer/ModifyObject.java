package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

class Product{
    int price;

    Product(int price){
        this.price=price;
    }
}

public class ModifyObject {
    public static void main(String[] args) {
        Product p = new Product(1100);

        Consumer<Product> discount = prod -> prod.price -= 200;
        discount.accept(p);

        System.out.println(p.price);
    }
}
