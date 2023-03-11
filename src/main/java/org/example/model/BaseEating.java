package org.example.model;
import lombok.*;
import org.example.model.BaseModel;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class BaseEating extends BaseModel {
    private String name;
    private double price;
    private String ingredients;

}
