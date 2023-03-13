package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Serializable> {

}
