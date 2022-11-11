package EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import Entity.*;
//import EmployeeService.*;
import Repository.*;

//import java.util.List;
//
//@RestController
//public class EmployeeController {
//
//    @Autowired
//    EmployeeService employeeService;
//
//    @PostMapping("/saveEmployees")
//    public List<Employee> saveEmployees(@RequestBody List<Employee> employeeList){
//        return employeeService.saveEmployeeData(employeeList);
//    }
//
//    @GetMapping("/getEmployee")
//    public List<Employee> getEmployees(){
//        return employeeService.getEmployees();
//    }
//
//    @GetMapping("/getEmployeeById/{empId}")
//    public Employee getEmployees(@PathVariable Long empId){
//        return employeeService.getEmployeeById(empId);
//    }
//
//    @DeleteMapping("/deleteEmployeeByDesignation/{designation}")
//    public List<Employee> deleteEmployeeByDesignation(@PathVariable String designation){
//        return employeeService.deleteEmployeeByDesignation(designation);
//    }
//
//    @GetMapping("/getEmployeeByDesignation/{designation}")
//    public Employee getEmployeesByDesignation(@PathVariable String designation){
//        return employeeService.getEmployeeByDesignation(designation);
//    }
//
//    @RequestMapping(value = "/pagingAndShortingEmployees/{pageNumber}/{pageSize}", method = RequestMethod.GET)
//    public Page<Employee> employeePagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize){
//
//        return employeeService.getEmployeePagination(pageNumber,pageSize, null);
//    }
//
//    @RequestMapping(value = "/pagingAndShortingEmployees/{pageNumber}/{pageSize}/{sortProperty}",
//            method = RequestMethod.GET)
//    public Page<Employee> employeePagination(@PathVariable Integer pageNumber,
//                                             @PathVariable Integer pageSize,
//                                             @PathVariable String sortProperty) {
//        return employeeService.getEmployeePagination(pageNumber, pageSize, sortProperty);
//    }
//}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        System.out.println(empData+"*********************************************");
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping(value="/getEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }
}