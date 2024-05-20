package com.ems.service;

import java.util.List;

import com.ems.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto createEmployee(EmployeeDto employeeDto);

	public EmployeeDto getEmployeeById(Long employeeId);

	public List<EmployeeDto> getAllEmployess();

	EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployee);

	void deleteEmployeeById(Long id);
}
