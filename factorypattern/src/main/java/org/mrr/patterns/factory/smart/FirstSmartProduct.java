package org.mrr.patterns.factory.smart;


import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.ProductType;

public class FirstSmartProduct implements Product {

    static {
        Factory.instance().registerProduct(ProductType.FIRST, new FirstSmartProduct());
    }

    @Override
    public String name() {
        return "first smart product";
    }
}
