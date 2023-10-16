package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    Employee employee;

    public Employee getIndivisualEmployee(Long empId){
        Employee employee1 = employeeRepository.findEmployeeById(empId);
        return employee1;
    }
}
