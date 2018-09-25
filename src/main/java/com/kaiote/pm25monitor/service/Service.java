package com.kaiote.pm25monitor.service;


import com.kaiote.pm25monitor.Model.Anchor;
import com.kaiote.pm25monitor.Repository.AnchorRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {



    public AnchorRepository anchorRepository;

    public Anchor addAnchor(Anchor anchor){
        anchorRepository.save(anchor);
        return anchor;
    }


    public Iterable<Anchor> getAnchors(){
        return anchorRepository.findAll();
    }
}
