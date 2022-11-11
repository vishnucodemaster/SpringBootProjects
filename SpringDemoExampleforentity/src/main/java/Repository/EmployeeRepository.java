package Repository;

import Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//  Employee findByEmpId(Long id);
//    
//    List<Employee> deleteByDesignation(String designation);
//    Employee findTopByDesignationOrderBySalaryDesc(String designation);
	
	
//	@Query("select e from Employees e")
//	List<Employee> findAllEmployeesQuery();
	
	
}
