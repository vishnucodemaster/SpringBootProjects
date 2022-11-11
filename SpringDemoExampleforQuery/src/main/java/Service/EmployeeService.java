package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Entity.Employee;
import Repository.EmployeeRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeData() {
        return employeeRepository.findAllEmployeesQuery();
    }

    public List<Employee> findEmployeesByDesignationAndActiveData(Boolean activeState, List<String> designationList) {
        return employeeRepository.findEmployeeByDesignationAndActiveQuery(activeState, designationList, Sort.by("age"));
    }

    public int updateEmployeeState(Boolean activeState, List<Long> empIdList) {
        return employeeRepository.updateEmployeeStateByEmployeeId(activeState,empIdList);
    }
    
    public  List<Employee> findByName(String name) {
    	return employeeRepository.findByName(name);
    }
}