package edu.mum.cs.ormexample.repository;

import edu.mum.cs.ormexample.model.Employee;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("select e from emp e where e.address.zipCode = :zipCode")
    public List<Employee> someName(String zipCode);


    @Query("select e from emp e where e.id = :id")
    public Employee getEmployeeById(Long id);

}
