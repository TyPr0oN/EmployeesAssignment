package sit.csc319.employeesassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sit.csc319.employeesassignment.entity.Employee;
import sit.csc319.employeesassignment.entity.EmployeeSalary;

public interface EmployeeSalaryInterface extends JpaRepository<EmployeeSalary, Long> {
    @Query(value = "SELECT avg(salary) FROM salaries s WHERE s.emp_no = ?",nativeQuery = true)
    String findAdverageSalaryById(@Param("id")Long id);
}
