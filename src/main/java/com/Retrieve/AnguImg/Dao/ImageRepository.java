package com.Retrieve.AnguImg.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Retrieve.AnguImg.Modal.Imagemodal;
@Component
public interface ImageRepository  extends JpaRepository<Imagemodal, Long>{
	Optional<Imagemodal> findByName(String name);

}
