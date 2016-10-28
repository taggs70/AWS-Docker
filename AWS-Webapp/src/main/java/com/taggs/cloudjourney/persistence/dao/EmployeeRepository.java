package com.taggs.cloudjourney.persistence.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.taggs.cloudjourney.persistence.model.Employee;
@RepositoryRestController
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee> findByName(String Employee);

}
