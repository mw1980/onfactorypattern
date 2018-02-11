package org.mrr.patterns.factory.naive;

import org.mrr.patterns.factory.beans.FirstProduct;
import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.ProductType;
import org.mrr.patterns.factory.beans.SecondProduct;

class Factory {

    Product createProduct(final ProductType type) {
        switch (type) {
            case FIRST:
                return new FirstProduct();
            case SECOND:
                return new SecondProduct();
            default:
                throw new IllegalArgumentException("Unable to create product with type: " + type);
        }
    }
}
