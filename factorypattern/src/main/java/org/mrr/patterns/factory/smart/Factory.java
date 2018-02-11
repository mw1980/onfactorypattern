package org.mrr.patterns.factory.smart;

import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.ProductType;

import java.util.HashMap;
import java.util.Map;

class Factory {

    private static Factory instance;
    private final Map<ProductType, Product> registeredProducts = new HashMap<>();

    static Factory instance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    Product create(final ProductType type) {
        if (instance.registeredProducts.containsKey(type)) {
            return instance.registeredProducts.get(type);
        } else {
            throw new IllegalArgumentException("No product available with type" + type);
        }
    }

    void registerProduct(final ProductType type, final Product product) {
        registeredProducts.put(type, product);
    }
}
