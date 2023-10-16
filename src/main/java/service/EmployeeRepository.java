package service;

import model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "select * from employee where emp_id = ?1", nativeQuery = true)
    Employee findEmployeeById(Long empId);

}
