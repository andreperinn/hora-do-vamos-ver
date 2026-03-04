package com.ap.milagre.repositories;

import com.ap.milagre.models.MilagreModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository <MilagreModels,Long> {

}
