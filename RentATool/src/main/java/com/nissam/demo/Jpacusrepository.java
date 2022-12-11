package com.nissam.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface Jpacustomerrepo extends JpaRepository<Customer,Integer> {

}
interface Jpatoolrepo extends JpaRepository<Tool, Integer>{
	
}


