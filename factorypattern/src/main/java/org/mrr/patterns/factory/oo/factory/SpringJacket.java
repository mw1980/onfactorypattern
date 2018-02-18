package org.mrr.patterns.factory.oo.factory;

import static java.lang.String.format;

public class SpringJacket implements Product {

    @Override
    public String name() {
        return "spring jacket";
    }

    @Override
    public ProductType productType() {
        return ProductType.JACKET;
    }

    @Override
    public String toString() {
        return format("[Spring jacket: product name=%s and product type=%s]", name(), productType());
    }
}
