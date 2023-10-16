package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    public Long empId;

    @Column(name = "emp_code")
    public String empCode;

    @Column(name="emp_name")
    public String empName;

    @Column(name="emp_salary")
    public Long empSalary;
}
