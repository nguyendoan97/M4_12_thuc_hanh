package com.codegym.service;

import com.codegym.model.SmartPhone;
import com.codegym.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Integer id) {
        SmartPhone smartphone = smartphoneRepository.findOne(id);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public SmartPhone save(SmartPhone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public SmartPhone remove(Integer id) {
        SmartPhone smartphone = findById(id);
        smartphoneRepository.delete(id);
        return smartphone;
    }
}