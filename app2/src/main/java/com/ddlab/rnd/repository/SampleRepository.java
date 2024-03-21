package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.collection.SurveyGroup;

@Repository
public interface SampleRepository extends CrudRepository<SurveyGroup, String> {

}
