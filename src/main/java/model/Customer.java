package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@ToString

public class Customer {
    private String id;
    private String name;
    private String address;
    private LocalDate dob;

    public Customer(String id, String name, String address, String title, LocalDate dob) {
        this.id = id;
        this.name = title+name;
        this.address = address;
        this.dob = dob;
    }

}
