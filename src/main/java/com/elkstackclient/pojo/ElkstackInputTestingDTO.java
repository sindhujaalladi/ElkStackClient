package com.elkstackclient.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ElkstackInputTestingDTO implements Serializable{
	
	private int id;
	private String username;
	private String descrption;
	private String version;
	

}
