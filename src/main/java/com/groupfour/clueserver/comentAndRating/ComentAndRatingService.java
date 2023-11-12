package com.groupfour.clueserver.comentAndRating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentAndRatingService {
           //Consumir el repository
    @Autowired
    private ComentAndRatingRepository comentAndRatingRepository;
//==================METHODS=====================
       //Metodo para read all data
    public List<ComentAndRatingModel> findAll()
    {
        return comentAndRatingRepository.findAll();
    }
        //Metodo read 
    public ComentAndRatingModel findById(Integer id)
    {
        return comentAndRatingRepository.findById(id).orElse(null);
    }
    //Metodo para el create
    public ComentAndRatingModel save(ComentAndRatingModel entity)
    {
        return comentAndRatingRepository.save(entity);
    }
    //Metodo update
    //No se define metodo se utiliza en metodo del create
    //Metodo delete
    public void deleteById(Integer id)
    {
        comentAndRatingRepository.deleteById(id);
    }
}
