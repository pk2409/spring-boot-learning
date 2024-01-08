package com.learningspring.springbootlearning.service;

import com.learningspring.springbootlearning.entity.Department;
import com.learningspring.springbootlearning.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("IT")
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .departmentid(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }

    @DisplayName("To get the data based on valid departemnt name ")
    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound(){

        String departmentName="IT";
        Department found= departmentService.fetchDepartmentByName(departmentName);
        //fetchdeptbyname is calling the respository layer, but we want to test only service layer
        //so we will have to mock it

        assertEquals(departmentName,found.getDepartmentName());
        //if both are equal then test case is passed , else if they are not equal, then it fails



    }
}