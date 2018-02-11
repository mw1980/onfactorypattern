package org.mrr.patterns.factory.functional;


import org.mrr.patterns.factory.beans.Product;

import java.util.function.Consumer;

public class Main {

    private static Consumer<Product> printProductName = product -> System.out.println(product.name());

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory
                .createProduct("first")
                .ifPresent(printProductName);

        factory
                .createProduct("second")
                .ifPresent(printProductName);

        factory
                .createProduct("wrong")
                .ifPresent(printProductName);
    }
}
