package Entity;

//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@NoArgsConstructor
//@Table(name = "Employeeees")
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long empId;
//    private String name;
//    private Integer age;
//    @Column(name = "PHONE_NUMBER")
//    private Long phoneNumber=(long) (Math.random()*Math.pow(10,10));
//    private String designation;
//    private Double salary = Math.random()*100000;
//}


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    //address_add_id - default fk column name
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_add_id")

    //unidirectional one-to-many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;



}
