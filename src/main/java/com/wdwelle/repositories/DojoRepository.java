package com.wdwelle.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wdwelle.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo> {
	List<Dojo> findAll();
}
