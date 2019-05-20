package pl.allegrotech.umk.productsfakeapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductsDto {

    private final List<ProductDto> products;

    @JsonCreator
    public ProductsDto(@JsonProperty List<ProductDto> products) {
        this.products = products;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

}
