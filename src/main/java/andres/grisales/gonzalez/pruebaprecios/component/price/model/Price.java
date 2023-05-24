package andres.grisales.gonzalez.pruebaprecios.component.price.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "price_list")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder(toBuilder = true)
public class Price {

    @Id
    @Column(name = "price_list")
    private Long priceList;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "priority")
    private Long priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "curr")
    @Enumerated(EnumType.STRING)
    private PriceCurrency currency;

}
