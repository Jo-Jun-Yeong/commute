package com.group.commute.Service;

import com.group.commute.DTO.Employee.EmployeeCreateRequest;
import com.group.commute.DTO.Employee.EmployeeResponse;
import com.group.commute.Domain.Employee;
import com.group.commute.Domain.EmployeeRepository;
import com.group.commute.Domain.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;

    public EmployeeService(EmployeeRepository employeeRepository,TeamRepository teamRepository) {//스프링 빈 주입
        this.employeeRepository = employeeRepository;
        this.teamRepository=teamRepository;
    }
//----------------------------------------------------------------------------

    public void createEmployee(EmployeeCreateRequest request){
        employeeRepository.save(new Employee(request.getName(), request.getRole(), request.getTeam(),request.getBirth(),request.getWorkStartDate()));
    }

    public List<EmployeeResponse> getEmployee(){
       return employeeRepository.findAll().stream().map(employee -> new EmployeeResponse(employee.getId(), employee.getName(), employee.getRole(), employee.getBirth(), employee.getWork_start_date(), "tam")).toList();
    }

    public void deleteEmployee(long id){
        employeeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        employeeRepository.deleteById(id);
    }


}
