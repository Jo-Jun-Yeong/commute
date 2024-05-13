package com.group.commute.Controller;

import com.group.commute.DTO.Employee.EmployeeCreateRequest;
import com.group.commute.DTO.Employee.EmployeeResponse;
import com.group.commute.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
//    private final JdbcTemplate jdbcTemplate;

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/v1/Employee")
    public void createEmployee(@RequestBody EmployeeCreateRequest request){
        employeeService.createEmployee(request);
    }

    @GetMapping("/v1/Employee")
    public List<EmployeeResponse> getEmployee(){
        return employeeService.getEmployee();
    }

    @DeleteMapping("v1/Employee")
    public void deleteEmployee(@RequestParam long id){
        employeeService.deleteEmployee(id);
    }
}
