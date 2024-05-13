package com.group.commute.Domain;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Primary
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//JpaRepository상속만으로도 스프링 빈으로 등록
Employee findByRole(String role);

}
