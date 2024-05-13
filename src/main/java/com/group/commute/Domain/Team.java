package com.group.commute.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @OneToMany(mappedBy = "team")
    private List<Employee> employees;

    private  String name;//팀 이름

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team(long id,String name) {
        if(name==null || name.isBlank()) throw new IllegalArgumentException(String.format("잘못된 name(s)입니다"));
        this.id=id;
        this.name = name;
    }
    protected Team(){

    }
}
