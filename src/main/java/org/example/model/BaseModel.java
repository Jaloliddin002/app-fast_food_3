package org.example.model;

import lombok.*;

import java.util.UUID;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {
    UUID id;
}
