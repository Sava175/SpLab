package com.splab.patterns.creationPatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TShirt {
    private String color;
    private String lettering;
    private int cost;

    public TShirt copy(){
        return new TShirt(this.color, this.lettering, this.cost);
    }
}
