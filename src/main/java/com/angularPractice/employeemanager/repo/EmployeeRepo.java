package com.angularPractice.employeemanager.repo;

import com.angularPractice.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
