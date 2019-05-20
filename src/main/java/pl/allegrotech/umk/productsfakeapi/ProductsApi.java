package pl.allegrotech.umk.productsfakeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsApi {

    @GetMapping
    List<ProductDto> products() {
        return Collections.unmodifiableList(
                Arrays.asList(
                        product("product-id-1",
                                "Krzesło",
                                "45.99",
                                "PLN",
                                "Bardzo wygodne krzesło",
                                "https://images.unsplash.com/photo-1505843490538-5133c6c7d0e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2550&q=80"
                        ),
                        product("product-id-2",
                                "Lepsze krzesło, ale tańsze",
                                "9.00",
                                "PLN",
                                "Bardzo wygodne krzesło (i tanie)",
                                "https://images.unsplash.com/photo-1505843490538-5133c6c7d0e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2550&q=80"
                        ),
                        product("product-id-3",
                                "Uber krzesło",
                                "455.99",
                                "PLN",
                                "Zajebiście drogie i wygodne krzesło",
                                "https://images.unsplash.com/photo-1505843490538-5133c6c7d0e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2550&q=80"
                        ),
                        product("product-id-4",
                                "Nie krzesło, a gówno :(",
                                "35.99",
                                "PLN",
                                "Bardzo złe krzesło",
                                "https://images.unsplash.com/photo-1505843490538-5133c6c7d0e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2550&q=80"
                        ),
                        product("product-id-5",
                                "Krzesło prezesowe",
                                "877",
                                "PLN",
                                "Krzesło prezesa (z uchem)",
                                "https://images.unsplash.com/photo-1505843490538-5133c6c7d0e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2550&q=80"
                        )
                )
        );
    }

    private ProductDto product(String id,
                               String name,
                               String priceAmount,
                               String priceCurrency,
                               String description,
                               String image) {
        return new ProductDto(
                id,
                name,
                new ProductDto.PriceDto(priceAmount, priceCurrency),
                new ProductDto.DescriptionDto(description),
                new ProductDto.ImageDto(image)
        );
    }

}