package sit.csc319.employeesassignment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salaries")
public class EmployeeSalary {
    @Id
    private Long empNo;
    private int salary;
    private String from_date;
    private String to_date;
}
