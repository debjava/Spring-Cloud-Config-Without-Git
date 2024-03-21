package com.ddlab.rnd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.collection.SurveyGroup;
import com.ddlab.rnd.repository.SampleRepository;

@Service
public class GroupServiceImpl implements GroupService {
	
	@Autowired
	private SampleRepository dataRepo;

	
	@Override
	public List<SurveyGroup> getAllGroups() {
		Iterable<SurveyGroup> iterables = dataRepo.findAll();
		System.out.println("All iterables: "+iterables);
		List<SurveyGroup> groupList = new ArrayList<>();
		iterables.forEach(groupList::add);
		return groupList;
	}
}
