package sit.csc319.employeesassignment.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sit.csc319.employeesassignment.entity.Employee;
import sit.csc319.employeesassignment.entity.EmployeeSalary;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeDTO {

    private Employee employee;
    private EmployeeSalary employeeSalary;
}
