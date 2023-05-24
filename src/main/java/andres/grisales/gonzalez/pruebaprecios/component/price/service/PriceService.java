package andres.grisales.gonzalez.pruebaprecios.component.price.service;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;

public interface PriceService {
    Price findByParameters(PriceSearchCommand commandSearch);
}
