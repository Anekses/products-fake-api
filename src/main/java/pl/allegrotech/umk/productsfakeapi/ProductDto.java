package pl.allegrotech.umk.productsfakeapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDto {

    private final String id;
    private final String name;
    private final PriceDto price;
    private final DescriptionDto description;
    private final ImageDto image;

    @JsonCreator
    public ProductDto(@JsonProperty String id,
                      @JsonProperty String name,
                      @JsonProperty PriceDto price,
                      @JsonProperty DescriptionDto description,
                      @JsonProperty ImageDto image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PriceDto getPrice() {
        return price;
    }

    public DescriptionDto getDescription() {
        return description;
    }

    public ImageDto getImage() {
        return image;
    }

    public static class PriceDto {
        private final String amount;
        private final String currency;

        @JsonCreator
        public PriceDto(@JsonProperty String amount,
                         @JsonProperty String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        public String getAmount() {
            return amount;
        }

        public String getCurrency() {
            return currency;
        }
    }

    public static class DescriptionDto {
        private final String text;

        @JsonCreator
        public DescriptionDto(@JsonProperty String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public static class ImageDto {
        private final String url;

        @JsonCreator
        public ImageDto(@JsonProperty String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

}
