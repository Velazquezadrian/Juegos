package com.sigmadrian.juegosapi.entity.DTO;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JuegosDTO {

    private Long id;

    private String titulo;

    private Date lanzado;

    private Double precio;
}
