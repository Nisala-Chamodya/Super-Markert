package lk.blacky.supermarkert.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
public class Item {
    @Id
    private String code;
    private   String description;
    private double price;
    private int qty;


}
