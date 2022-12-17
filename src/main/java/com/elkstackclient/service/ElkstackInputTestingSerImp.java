package com.elkstackclient.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkstackclient.entity.ElkstackInputTesting;
import com.elkstackclient.pojo.ElkstackInputTestingDTO;


@Service
public class ElkstackInputTestingSerImp {

	@Autowired
	private com.elkstackclient.repository.ElkstackInputTestingRepository elkstackInputTestingRepository;
	
	Logger logger=LoggerFactory.getLogger(ElkstackInputTestingSerImp.class);

	
	public String createDataForELK(ElkstackInputTestingDTO elkstackInputTestingDTO ) {
		logger.info("Beginning of createDataForELK method");
		ElkstackInputTesting elkobj = ElkstackInputTesting.builder()
				.id(elkstackInputTestingDTO.getId())
				.descrption(elkstackInputTestingDTO.getDescrption())
				.username(elkstackInputTestingDTO.getUsername())
				.version(elkstackInputTestingDTO.getVersion())
				.build();
		elkstackInputTestingRepository.save(elkobj);
		String response = "ELK data has been successfully added in db";
		logger.info("End of createDataForELK method"+response);
		return response;
		
	}
	
	public List<ElkstackInputTesting> getAllElkStackData(){
		
		logger.info("Beginning of getAllElkStackData method");
		List<ElkstackInputTesting> elkentobj = elkstackInputTestingRepository.findAll();
		logger.info("End of getAllElkStackData method"+elkentobj);
		return elkentobj;
	}
}
