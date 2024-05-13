package com.group.commute.DTO.Employee;

import com.group.commute.Domain.Employee;
import com.group.commute.Domain.Team;

import java.time.LocalDate;

public class EmployeeCreateRequest {
    private long id;
    private String name;//직원이름
    private String role; //매니저(manager) or 멤버(member)
    private Team team;
    private LocalDate birth;//생일
    private LocalDate workStartDate;//입사일


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Team getTeam() {
        return team;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public EmployeeCreateRequest(String name, String role, Team team , LocalDate birth, LocalDate workStartDate) {
        this.name = name;
        this.role = role;
        this.team=team;
        this.birth = birth;
        this.workStartDate = workStartDate;
    }

    public EmployeeCreateRequest(Employee employee, Team team){
        this.name= employee.getName();
        this.role=employee.getRole();
        this.team=team;
        this.birth=employee.getBirth();
        this.workStartDate=employee.getWork_start_date();

    }
    protected EmployeeCreateRequest(){

    }
}
