package org.mrr.patterns.factory.oo.factory;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TextileFactory implements Factory, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Product createProduct(final ProductType type) {
        return this.applicationContext.getBeansOfType(Product.class)
        .values().stream()
        .filter(product -> type == product.productType())
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException(
                 String.format("Unable to create product of type: %s. This product type is not supported.", type)
        ));
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
