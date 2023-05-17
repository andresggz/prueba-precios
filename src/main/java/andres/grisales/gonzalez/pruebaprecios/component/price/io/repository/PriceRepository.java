package andres.grisales.gonzalez.pruebaprecios.component.price.io.repository;

import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long>, JpaSpecificationExecutor<Price> {
}
