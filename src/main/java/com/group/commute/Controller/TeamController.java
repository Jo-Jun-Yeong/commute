package com.group.commute.Controller;

import com.group.commute.DTO.Team.TeamResponse;
import com.group.commute.DTO.Team.TeamSaveRequest;
import com.group.commute.Service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/v1/Team")
    public void saveTeam(@RequestBody TeamSaveRequest request){
        teamService.saveTeam(request);
    }

    @GetMapping("/v1/Team")
    public List<TeamResponse> getTeam(){
        return teamService.getTeam();
    }
    @DeleteMapping("/v1/Team")
    public void deleteTeam(@RequestParam String name){
        teamService.deleteTeam(name);
    }

}
