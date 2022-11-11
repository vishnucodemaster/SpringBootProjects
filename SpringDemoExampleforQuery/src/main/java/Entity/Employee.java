package Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Employee.findByName", query = "select e from Employee e where e.name=?1")
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private Integer age;
    private Boolean active;
    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber=(long) (Math.random()*Math.pow(10,10));
    private String designation;
    private Double salary = Math.random()*100000;
}