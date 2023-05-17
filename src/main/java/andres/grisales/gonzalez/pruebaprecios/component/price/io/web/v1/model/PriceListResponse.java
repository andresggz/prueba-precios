package andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(toBuilder = true)
public class PriceListResponse {

    private Long priceId;

    private Long brandId;

    private BigDecimal price;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long productId;

    public static PriceListResponse fromModel(Price price) {
        return PriceListResponse.builder()
                .priceId(price.getPriceList())
                .brandId(price.getBrandId())
                .price(price.getPrice())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .productId(price.getProductId())
                .build();
    }
}
