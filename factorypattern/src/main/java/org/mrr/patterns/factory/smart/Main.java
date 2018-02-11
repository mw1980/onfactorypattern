package org.mrr.patterns.factory.smart;


import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.ProductType;

public class Main {

    public static void main(final String[] args) {

        try {
            Class.forName("org.mrr.patterns.factory.smart.FirstSmartProduct");
            Class.forName("org.mrr.patterns.factory.smart.SecondSmartProduct");
        } catch (ClassNotFoundException any) {
            any.printStackTrace();
        }

        final Factory factory = new Factory();
        final Product first = factory.create(ProductType.FIRST);
        System.out.println(first.name());
    }
}
