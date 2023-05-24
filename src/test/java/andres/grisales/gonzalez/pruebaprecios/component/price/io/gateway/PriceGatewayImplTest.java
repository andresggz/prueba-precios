package andres.grisales.gonzalez.pruebaprecios.component.price.io.gateway;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.repository.PriceRepository;
import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PriceGatewayImplTest {

    @InjectMocks
    private PriceGatewayImpl priceGateway;

    @Mock
    private PriceRepository priceRepository;


    @Test
    public void shouldFindByParameters() {
        when(priceRepository.findAll(any(Specification.class), any(PageRequest.class))).thenReturn(new PageImpl<>(List.of(Price.builder().build()), Pageable.unpaged(), 1));
        priceGateway.findByParameters(PriceSearchCommand.builder().build());
        verify(priceRepository).findAll(any(Specification.class), any(PageRequest.class));
    }
}
