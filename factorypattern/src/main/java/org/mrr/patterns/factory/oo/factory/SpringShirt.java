package org.mrr.patterns.factory.oo.factory;

import static java.lang.String.format;

public class SpringShirt implements Product {
    @Override
    public String name() {
        return "Spring T-Shirt";
    }

    @Override
    public ProductType productType() {
        return ProductType.SHIRT;
    }

    @Override
    public String toString() {
        return format("[Spring shirt: product name=%s and product type=%s]", name(), productType());
    }
}