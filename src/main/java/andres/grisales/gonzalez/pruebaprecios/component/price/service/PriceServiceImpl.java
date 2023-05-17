package andres.grisales.gonzalez.pruebaprecios.component.price.service;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceGateway priceGateway;

    @Override
    public Page<Price> findByParameters(PriceSearchCommand commandSearch, Pageable pageable) {
        return priceGateway.findByParameters(commandSearch, pageable);
    }
}
