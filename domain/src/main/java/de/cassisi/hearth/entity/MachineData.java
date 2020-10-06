package de.cassisi.hearth.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public final class MachineData {

    private final String oxygenator;
    private final String haemoFil;


}
