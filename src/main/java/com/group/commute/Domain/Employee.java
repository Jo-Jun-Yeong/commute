package com.group.commute.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id=null;
    @Column//(nullable=false, length=20, name ="name")
    private String name;//직원이름
//    private String teamName;//소속 팀 이름
    private String role; //매니저(manager) or 멤버(member)

//    private String teamName; //외래키
    @OneToOne
    private Team team;
    private LocalDate birth;//생일
    private LocalDate work_start_date;//입사일



    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Team getTeam(){
        return team;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public LocalDate getWork_start_date() {
        return work_start_date;
    }


    public Employee(String name, String role, Team team ,LocalDate birth, LocalDate work_start_date) {
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%n)이 들어왔습니다."));
        }
        this.name = name;
        this.team = team;
        this.role = role;
        this.birth = birth;
        this.work_start_date = work_start_date;
    }
    protected Employee(){

    }


}


