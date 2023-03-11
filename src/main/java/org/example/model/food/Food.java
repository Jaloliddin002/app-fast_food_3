package org.example.model.food;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.model.BaseEating;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Food extends BaseEating {
    int time;      //  [min]
    int calorie;   //  [kKal]
}
