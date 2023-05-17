package andres.grisales.gonzalez.pruebaprecios.component.price.service;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PriceService {
    Page<Price> findByParameters(PriceSearchCommand commandSearch, Pageable pageable);
}
