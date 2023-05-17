package andres.grisales.gonzalez.pruebaprecios.component.price.io.gateway;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.repository.PriceRepository;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PriceGatewayImplTest {

    @InjectMocks
    private PriceGatewayImpl priceGateway;

    @Mock
    private PriceRepository priceRepository;


    @Test
    public void shouldFindByParameters() {
        priceGateway.findByParameters(PriceSearchCommand.builder().build(), PageRequest.of(2, 10));
        verify(priceRepository).findAll(any(Specification.class), any(PageRequest.class));
    }
}
