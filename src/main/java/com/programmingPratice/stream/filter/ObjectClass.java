package com.programmingPratice.stream.filter;


import java.util.ArrayList;
import java.util.List;

class Product{

    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class ObjectClass {
    public static void main(String[]args){
        List<Product>productList=new ArrayList<>();

        productList.add(new Product(1,"dell laptop",25000));
        productList.add(new Product(2,"lenovo laptop",35000));
        productList.add(new Product(3,"asus laptop",45000));
        productList.add(new Product(4,"gaming laptop",65000));

        productList.stream().filter(n->n.price>25000).forEach(n->System.out.println(n.name));


    }


}
