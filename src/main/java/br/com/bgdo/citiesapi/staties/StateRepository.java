package br.com.bgdo.citiesapi.staties;

import br.com.bgdo.citiesapi.staties.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}