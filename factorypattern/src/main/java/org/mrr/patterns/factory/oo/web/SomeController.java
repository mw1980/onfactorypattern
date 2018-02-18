package org.mrr.patterns.factory.oo.web;

import org.mrr.patterns.factory.oo.factory.ProductType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    private final SomeService someService;

    public SomeController(final SomeService someService) {
        this.someService = someService;
    }

    @RequestMapping("/")
    public String index(@RequestParam final ProductType type) {
        return someService.createdProduct(type).toString();
    }
}
