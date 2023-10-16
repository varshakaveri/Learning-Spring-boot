package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

@RestController
@RequestMapping("/practice/learning")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "emp-id", method = RequestMethod.GET)
    public ResponseEntity getIndividualEmployee(@PathVariable Long empId){
        return new ResponseEntity(employeeService.getIndivisualEmployee(empId), HttpStatus.OK);
    }
}
