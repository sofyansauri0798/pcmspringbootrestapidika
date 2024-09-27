package com.juaracoding.service;


import com.juaracoding.model.Contoh;
import com.juaracoding.model.ParentEntity;
import com.juaracoding.model.User;
import com.juaracoding.repo.ContohRepo;
import com.juaracoding.repo.ParentRepo;
import com.juaracoding.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParentService {

    @Autowired
    ParentRepo parentRepo;

    @Autowired
    ContohRepo contohRepo;

    @Autowired
    UserRepo userRepo;


    @Transactional
    public String save(ParentEntity parentEntity,Contoh contoh,User user){
        try{
            parentRepo.save(parentEntity);
            contohRepo.save(contoh);
            userRepo.save(user);
            userRepo.findAll();
        }catch (Exception e){
            return "ERROR , GAGAL SIMPAN";
        }
        return "BERHASIL SIMPAN";
    }
}