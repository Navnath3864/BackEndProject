package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AllPersonalDocs;
@Repository
public interface AllPersonalDocumentsRepository extends JpaRepository<AllPersonalDocs, Integer>{

}
