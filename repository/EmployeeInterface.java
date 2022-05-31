package sit.csc319.employeesassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sit.csc319.employeesassignment.entity.Employee;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee, Long> {
//    public Employee findByEmpno(Long empno);
    @Query(value = "select * from employees e where e.emp_no = ?",nativeQuery = true)
    public Employee findByEmpno(@Param("empno") Long empno);
}
