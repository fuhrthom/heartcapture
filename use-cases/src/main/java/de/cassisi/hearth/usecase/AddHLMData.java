package de.cassisi.hearth.usecase;

import de.cassisi.hearth.entity.HLMData;
import de.cassisi.hearth.identifier.OperationId;
import de.cassisi.hearth.port.HLMReader;
import de.cassisi.hearth.port.OperationRepository;

public class AddHLMData {

    private HLMReader hlmReader;
    private OperationRepository operationRepository;

    public AddHLMData(HLMReader hlmReader, OperationRepository operationRepository) {
        this.hlmReader = hlmReader;
        this.operationRepository = operationRepository;
    }

    public void addHLMDataFromFile(OperationId operationId, String path) {
        HLMData hlmData = hlmReader.readFromFile(path);
        operationRepository.addHLMData(operationId, hlmData);
    }

}