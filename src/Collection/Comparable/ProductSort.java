package Collection.Comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
    private int pId;
    private String pName;
    private double pPrice;

    Product(int pId, String pName, double pPrice){
        this.pId=pId;
        this.pName=pName;
        this.pPrice=pPrice;
    }

    public String toString(){
        return "Product : { Id-> "+pId+", Name-> "+pName+", Price-> "+pPrice+" }";
    }

    public int compareTo(Product p){
        return this.pId - p.pId;
    }
}

public class ProductSort {
    public static void main(String[] args) {
        Product p1 = new Product(105,"Laptop",76000);
        Product p2 = new Product(102,"Charger",1200);
        Product p3 = new Product(101,"Computer",45000);
        Product p4 = new Product(103,"Keyboard",1500);
        Product p5 = new Product(104,"Mouse",890);

        ArrayList<Product> productList =  new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        System.out.println("Before sort : "+productList);

        Collections.sort(productList);
        System.out.println("After sort : "+productList);
    }
}
