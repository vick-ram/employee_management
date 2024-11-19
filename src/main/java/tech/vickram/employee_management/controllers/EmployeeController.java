package tech.vickram.controllers;

import org.springframework.web.bind.annotation.*;
import tech.vickram.models.Employee;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return List.of(
            new Employee(
                1L,
                "Vickram",
                "Rajendran",
                "",
                "Software Engineer"
            )
        );
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(Long employeeId) {
        return new Employee(
            1L,
            "Vickram",
            "Rajendran",
            "",
            "Software Engineer"
        );
    }

    @PostMapping("/employees")
    public void registerNewEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId) {
        System.out.println(employeeId);
    }

    @PutMapping("/employees/{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestBody Employee employee) {
        System.out.println(String.format("%s %s", employeeId, employee));
    }
}
