package andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model.PriceSaveResponse;
import andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model.PriceSearchRequest;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/prices")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    public ResponseEntity<PriceSaveResponse> findByParameters(PriceSearchRequest searchRequest) {
        var commandSearch = PriceSearchRequest.toModel(searchRequest);

        var priceFound = priceService.findByParameters(commandSearch);

        return ResponseEntity.ok(PriceSaveResponse.fromModel(priceFound));
    }
}
