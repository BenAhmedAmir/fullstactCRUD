package com.springboot.fullstack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.fullstack.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
