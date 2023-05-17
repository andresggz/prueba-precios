package andres.grisales.gonzalez.pruebaprecios.component.price.service;

import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @InjectMocks
    private PriceServiceImpl priceService;

    @Mock
    private PriceGateway priceGateway;


    @Test
    public void shouldFindByParameters() {
        priceService.findByParameters(PriceSearchCommand.builder().build(), PageRequest.of(1, 2));
        verify(priceGateway).findByParameters(any(), any());
    }

}
