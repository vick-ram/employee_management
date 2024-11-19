package tech.vickram.models;

public class Employee {
    private Long employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee(
        Long employee_id,
        String first_name,
        String last_name,
        String email,
        String title
    ) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }
}
