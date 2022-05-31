package sit.csc319.employeesassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.csc319.employeesassignment.DTO.CreateEmployeeDTO;
import sit.csc319.employeesassignment.DTO.EmployeeDTO;
import sit.csc319.employeesassignment.entity.Employee;
import sit.csc319.employeesassignment.entity.EmployeeSalary;
import sit.csc319.employeesassignment.repository.EmployeeInterface;
import sit.csc319.employeesassignment.repository.EmployeeSalaryInterface;

import java.util.Map;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeInterface employeeInterface;
    @Autowired
    private EmployeeSalaryInterface employeeSalaryInterface;


    @GetMapping(value = "/searchemploy/{id}")
    public EmployeeDTO getEmployeeByNumber (@PathVariable("id") Long empno){
        EmployeeDTO res = new EmployeeDTO();
        Employee e = employeeInterface.findByEmpno(empno);
        res.setAverageSalary(employeeSalaryInterface.findAdverageSalaryById(empno));
        res.setBirthDate(e.getBirthDate());
        res.setFirstName(e.getFirstName());
        res.setLastName(e.getLastName());
        res.setGender(e.getGender());
        res.setHireDate(e.getHireDate());
        return res;
    }

    @PostMapping(value = "/addemploy/")
    public void addEmployee(@RequestBody CreateEmployeeDTO json){
        Employee resa = employeeInterface.save(json.getEmployee());
        EmployeeSalary temp = json.getEmployeeSalary();
        temp.setEmpNo(resa.getEmpNo());
        employeeSalaryInterface.save(temp);
    }
}
