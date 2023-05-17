package andres.grisales.gonzalez.pruebaprecios.component.price.service.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
public class PriceSearchCommand {

    private LocalDateTime applicationDate;

    private Long productId;

    private Long brandId;
}
