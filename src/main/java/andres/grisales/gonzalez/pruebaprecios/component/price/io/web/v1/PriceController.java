package andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model.PriceListResponse;
import andres.grisales.gonzalez.pruebaprecios.component.price.io.web.v1.model.PriceSearchRequest;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.PriceService;
import andres.grisales.gonzalez.pruebaprecios.component.shared.model.ResponsePagination;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/prices")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    public ResponseEntity<ResponsePagination> findByParameters(PriceSearchRequest searchRequest, Pageable pageable) {
        var commandSearch = PriceSearchRequest.toModel(searchRequest);

        var pricesFound = priceService.findByParameters(commandSearch, pageable);

        List<PriceListResponse> priceListResponses = pricesFound.stream()
                .map(PriceListResponse::fromModel)
                .collect(Collectors.toList());

        return ResponseEntity.ok(ResponsePagination.fromObject(priceListResponses, pricesFound.getTotalElements(), pricesFound.getNumber(),
                priceListResponses.size()));
    }
}
