package com.group.commute.DTO.Employee;

import com.group.commute.Domain.Employee;
//import com.group.commute.Domain.Team;

import java.time.LocalDate;

public class EmployeeResponse {
    private long id;
    private String name;//직원이름
    private String role; //매니저(manager) or 멤버(member)
    private LocalDate birth;//생일
    private LocalDate workStartDate;//입사일
    private String team_Name;//소속 팀 이름

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public String getTeam_Name() {
        return team_Name;
    }

    public EmployeeResponse(long id, String name, String role, LocalDate birth, LocalDate workStartDate, String team_Name) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.birth = birth;
        this.workStartDate = workStartDate;
        this.team_Name = team_Name;
    }
    public EmployeeResponse(Employee employee, String team_Name){
        this.id = employee.getId();
        this.name = employee.getName();
        this.role = employee.getRole();
        this.birth = employee.getBirth();
        this.workStartDate = employee.getWork_start_date();
        this.team_Name = team_Name;
    }

    protected EmployeeResponse(){
    }
}
