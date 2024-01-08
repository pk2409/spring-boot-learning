package com.learningspring.springbootlearning.repository;

import com.learningspring.springbootlearning.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
        //before starting our test case, we are saving this particular data into the database before the start of every test case
        //data is deleted before start of every test case
    void setUp() {
        Department department=Department.builder()
                .departmentName("Mechanical")
                .departmentCode("ME05")
                .departmentAddress("Delhi")
                .build();
        //this department is the object that we want to persist

        entityManager.persist(department);
    }

    //creating test function over here

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department= departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(),"Mechanical");

    }
}