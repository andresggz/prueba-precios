package andres.grisales.gonzalez.pruebaprecios.component.price.io.gateway;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.repository.PriceRepository;
import andres.grisales.gonzalez.pruebaprecios.component.price.model.Price;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.PriceGateway;
import andres.grisales.gonzalez.pruebaprecios.component.price.service.model.PriceSearchCommand;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Repository
@RequiredArgsConstructor
public class PriceGatewayImpl implements PriceGateway {

    private final PriceRepository priceRepository;

    @Override
    public Page<Price> findByParameters(PriceSearchCommand commandSearch, Pageable pageable) {
        var priceSpecification = buildCriteria(commandSearch);

        return priceRepository.findAll(priceSpecification, pageable);
    }

    private Specification<Price> buildCriteria(PriceSearchCommand queryCriteria) {

        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(nonNull(queryCriteria.getProductId())){
                predicates
                        .add(criteriaBuilder.and(
                                criteriaBuilder.equal(root.get("productId"),  queryCriteria.getProductId())));
            }

            if(nonNull(queryCriteria.getBrandId())){
                predicates
                        .add(criteriaBuilder.and(
                                criteriaBuilder.equal(root.get("brandId"),  queryCriteria.getBrandId())));
            }

            if(nonNull(queryCriteria.getApplicationDate())){
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("endDate"), queryCriteria.getApplicationDate()));
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("startDate"), queryCriteria.getApplicationDate()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        };

    }
}
