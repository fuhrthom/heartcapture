package de.cassisi.hearth.usecase;

import de.cassisi.hearth.usecase.template.UseCaseTemplate;

import java.time.LocalDateTime;

import static de.cassisi.hearth.usecase.AddNirsData.*;

public interface AddNirsData extends UseCaseTemplate<InputData, OutputData> {

    class InputData {
        public long operationId;
        public double leftSaturation;
        public double rightSaturation;
        public LocalDateTime timestamp;
    }

    class OutputData {
        public boolean saved;
    }

}