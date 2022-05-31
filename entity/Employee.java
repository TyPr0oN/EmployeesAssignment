package sit.csc319.employeesassignment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "employees")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "emp_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empNo;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hireDate;





    public Employee(Long empNo,String birthDate, String firstName, String lastName, String gender, String hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;

    }
    @OneToMany(mappedBy = "empNo")
    List<EmployeeSalary> salary;
}
