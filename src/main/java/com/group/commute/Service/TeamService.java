package com.group.commute.Service;

import com.group.commute.DTO.Team.TeamResponse;
import com.group.commute.DTO.Team.TeamSaveRequest;
import com.group.commute.Domain.Employee;
import com.group.commute.Domain.EmployeeRepository;
import com.group.commute.Domain.Team;
import com.group.commute.Domain.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeamService {
    private  TeamRepository teamRepository;
    private EmployeeRepository employeeRepository;

    public TeamService(TeamRepository teamRepository,EmployeeRepository employeeRepository) {
        this.teamRepository = teamRepository;
        this.employeeRepository=employeeRepository;
    }

    public void saveTeam(TeamSaveRequest request){
        teamRepository.save(new Team(request.getId(), request.getName()));
    }

    public List<TeamResponse> getTeam(){
        Employee find_manager = employeeRepository.findByRole("role");
        return teamRepository.findAll().stream().map(team ->
                new TeamResponse(
                        new Team(team.getId(),
                                team.getName()),
                        find_manager.getName(),
                        teamRepository.countByName(team.getName())))
                .toList();
    }
    public void deleteTeam(String TeamName){
        teamRepository.findByName(TeamName).orElseThrow(IllegalArgumentException::new);
        teamRepository.deleteByName(TeamName);
    }
}
