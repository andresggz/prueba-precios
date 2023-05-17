package andres.grisales.gonzalez.pruebaprecios;

import andres.grisales.gonzalez.pruebaprecios.component.price.io.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaPreciosApplication implements ApplicationRunner {

	@Autowired
	private PriceRepository priceRepository;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPreciosApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//var data = priceRepository.findAll();
		//System.out.println("end");
	}
}
