package de.cassisi.heartcapture.ui.event;

import javafx.stage.Window;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.io.File;

@Getter
@AllArgsConstructor
public class AddHlmFileToOperationEvent {

    private final long operationId;
    @NonNull private final File hlmFile;
    private final Window owner;

}
