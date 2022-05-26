package com.example.inclassapi.repository;

import com.example.inclassapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository {

    List<Employee> getByFiltedAge(int age);
}
