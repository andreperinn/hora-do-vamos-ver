package com.ap.milagre.service;

import com.ap.milagre.models.MilagreModels;
import com.ap.milagre.repositories.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/milagres")
public class MilagreService  {

    @Autowired
   private  MilagreRepository milagreRepository;

    //get
    @GetMapping
    public List<MilagreModels> milagreModelsList(){
        return milagreRepository.findAll();
    }

    //post
    @PostMapping
    public MilagreModels criar(@RequestBody MilagreModels milagreModels){
        return milagreRepository.save(milagreModels);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        milagreRepository.deleteById(id);
    }
    //PUT
    @PutMapping("/{id}")
    public MilagreModels atualizar( @PathVariable Long id,@RequestBody MilagreModels milagreModels){
        MilagreModels newMIlagre = milagreRepository.findById(id).get();
        newMIlagre.setNome(milagreModels.getNome());
        return milagreRepository.save(newMIlagre);
    }


    public MilagreRepository getMilagreRepository() {
        return milagreRepository;
    }
}
