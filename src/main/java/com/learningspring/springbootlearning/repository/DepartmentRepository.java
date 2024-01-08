package com.learningspring.springbootlearning.repository;

import com.learningspring.springbootlearning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //have to create method as a predefined method does not exist in jpa repository for fetching the names

    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
