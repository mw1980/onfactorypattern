package org.mrr.patterns.factory.naive;

import org.mrr.patterns.factory.beans.ProductType;

public class Main {
    public static void main(final String[] args) {
        Factory factory = new Factory();
        System.out.println(
                factory.createProduct(ProductType.FIRST).name()
        );
        System.out.println(
                factory.createProduct(ProductType.SECOND).name()
        );
    }
}
