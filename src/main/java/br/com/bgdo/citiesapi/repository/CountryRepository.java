package br.com.bgdo.citiesapi.repository;

import br.com.bgdo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
