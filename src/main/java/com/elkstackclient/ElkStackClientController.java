package com.elkstackclient;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elkstackclient.entity.ElkstackInputTesting;
import com.elkstackclient.pojo.ElkstackInputTestingDTO;
import com.elkstackclient.service.ElkstackInputTestingSerImp;

@RestController
@RequestMapping("/elkstack")
public class ElkStackClientController {
	
	@Autowired
	private ElkstackInputTestingSerImp elkstackInputTestingSerImp;
	
	Logger logger=LoggerFactory.getLogger(ElkStackClientController.class);

	
	
	@PostMapping("/createelkstackdata")
	public String createDataForELK(@RequestBody ElkstackInputTestingDTO elkstackInputTestingDTO) {
		logger.info("Beginning of createDataForELK method from controller");
		String res = this.elkstackInputTestingSerImp.createDataForELK(elkstackInputTestingDTO);
		logger.info("End of createDataForELK method from controller");
		return res;
	}
	
	
	@GetMapping("/getelkstackdata")
	public List<ElkstackInputTesting> getAllElkStackData(){
		logger.info("Beginning of getAllElkStackData method from controller");
		List<ElkstackInputTesting> res = this.elkstackInputTestingSerImp.getAllElkStackData();
		logger.info("End of getAllElkStackData method from controller");
		return res;
	}

}
