package org.corejava.Generics;

public class GenEx1<T,U,V> {
    T item;
    U product;
    V price;
    public GenEx1(T item, U product, V price) {
        this.item = item;
        this.product = product;
        this.price = price;
    }
    public T getItem() {
        return item;
    }
    public U getProduct() {
        return product;
    }
    public V getPrice() {
        return price;
    }
    public static void main(String[] args) {
        GenEx1<String, String, Double> genEx1 = new GenEx1<>("Laptop", "Dell XPS 13", 999.99);
       System.out.println("Item: " + genEx1.getItem());
        System.out.println("Product: " + genEx1.getProduct());
        // Print the price with rupee symbol

        System.out.println("Price: ₹" + genEx1.getPrice());
    }
}
