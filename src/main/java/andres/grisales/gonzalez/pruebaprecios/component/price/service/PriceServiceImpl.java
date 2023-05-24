package andres.grisales.gonzalez.pruebaprecios.component.price.service;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceGateway priceGateway;

    @Override
    public Price findByParameters(PriceSearchCommand commandSearch) {
        return priceGateway.findByParameters(commandSearch);
    }
}
