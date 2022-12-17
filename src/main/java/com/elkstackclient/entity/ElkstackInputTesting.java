package com.elkstackclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.elkstackclient.pojo.ElkstackInputTestingDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ElkstackInputTesting")
public class ElkstackInputTesting {
	
	
	@Id
	private int id;
	
	@Column(name = "UserName")
	private String username;
	
	@Column(name="Descrption")
	private String descrption;
	
	@Column(name = "Version")
	private String version;
	

}
