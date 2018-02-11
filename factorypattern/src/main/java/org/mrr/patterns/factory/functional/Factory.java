package org.mrr.patterns.factory.functional;


import org.mrr.patterns.factory.beans.Product;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Factory {

    Optional<Product> createProduct(final String productKey) {
        return allRegisteredFactories().stream()
                .map(factory -> factory.apply(productKey))
                .filter(Optional::isPresent)
                .findFirst()
                .orElse(Optional.empty());
    }

    private List<Function<String, Optional<Product>>> allRegisteredFactories() {
        return Stream.of(Factories.class.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(Producer.class))
                .map(this::factoryForField)
                .collect(toList());
    }

    @SuppressWarnings("unchecked")
    private Function<String, Optional<Product>> factoryForField(final Field field) {
        try {
            return (field.get(this) instanceof Function)
                    ? (Function<String, Optional<Product>>) field.get(this)
                    : productId -> Optional.empty();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to access the required factory", e);
        }
    }
}
