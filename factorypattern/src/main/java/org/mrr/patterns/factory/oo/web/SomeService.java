package org.mrr.patterns.factory.oo.web;

import org.mrr.patterns.factory.oo.factory.Factory;
import org.mrr.patterns.factory.oo.factory.Product;
import org.mrr.patterns.factory.oo.factory.ProductType;

class SomeService {

    private final Factory factory;

    SomeService(final Factory factory) {
        this.factory = factory;
    }

    Product createdProduct(final ProductType type){
        return factory.createProduct(type);
    }
}
