package com.groupfour.clueserver.comentAndRating;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComentAndRatingRepository extends CrudRepository<ComentAndRatingModel, Integer> {
    List<ComentAndRatingModel> findAll();
}
