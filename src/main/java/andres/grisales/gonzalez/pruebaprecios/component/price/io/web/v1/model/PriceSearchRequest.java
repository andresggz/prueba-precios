package andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model;

import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
public class PriceSearchRequest {

    private LocalDateTime applicationDate;

    private Long productId;

    private Long brandId;

    public static PriceSearchCommand toModel(PriceSearchRequest request) {
        return PriceSearchCommand
                .builder()
                .applicationDate(request.getApplicationDate())
                .brandId(request.getBrandId())
                .productId(request.getProductId())
                .build();
    }
}
