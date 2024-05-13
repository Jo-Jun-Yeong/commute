package com.group.commute.DTO.Team;

import com.group.commute.Domain.Team;

/* {
         *   "name":"팀 이름",
         *    "manager":"팀 매니저 이름", //없을 경우 null
         *    "memberCount":팀 인원 수[숫자]
        * }
        * */
public class TeamResponse {
    private final String name;//팀 이름
    private final String manager;//팀 매니저 이름, 없을경우 null
    private final long memberCount; //팀 인원 수

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }
    public long getMemberCount() {
        return memberCount;
    }

    public TeamResponse(String name, String manager, long memberCount) {
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
    }
    public TeamResponse(Team team , String manager, long memberCount){
        this.name= team.getName();
        this.manager=manager;
        this.memberCount=memberCount;
    }
}
