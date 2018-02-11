package org.mrr.patterns.factory.functional;

import org.mrr.patterns.factory.beans.FirstProduct;
import org.mrr.patterns.factory.beans.Product;
import org.mrr.patterns.factory.beans.SecondProduct;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Factories {

    @Producer
    public static final Function<String, Optional<Product>> FIRST_FACTORY =
            productKey -> productKey.equals("first")
                    ? Optional.of(new FirstProduct())
                    : Optional.empty();

    @Producer
    public static final Function<String, Optional<Product>> SECOND_FACTORY =
            productKey -> productKey.equals("second")
                    ? Optional.of(new SecondProduct())
                    : Optional.empty();

    //@Producer
    //wrong configured factory
    public static final Consumer<String> THIRD_FACTORY =
            System.out::println;
}
