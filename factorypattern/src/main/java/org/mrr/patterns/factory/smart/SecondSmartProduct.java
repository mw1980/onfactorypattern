package org.mrr.patterns.factory.smart;


import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.ProductType;

public class SecondSmartProduct implements Product {

    static {
        Factory.instance().registerProduct(ProductType.SECOND, new SecondSmartProduct());
    }

    @Override
    public String name() {
        return "second smart product";
    }
}
