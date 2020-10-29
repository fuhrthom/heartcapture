package de.cassisi.hearth.port;

import de.cassisi.hearth.entity.AnesthesiaData;
import de.cassisi.hearth.repository.AnesthesiaRepository;
import de.cassisi.hearth.repository.OperationRepository;
import de.cassisi.hearth.repository.model.AnesthesiaDataDB;
import de.cassisi.hearth.repository.model.OperationDB;
import de.cassisi.hearth.usecase.exception.OperationNotFoundException;
import de.cassisi.hearth.usecase.port.AddAnesthesiaDataRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class AddAnesthesiaDataJpaRepository implements AddAnesthesiaDataRepository {

    private final AnesthesiaRepository anesthesiaRepository;
    private final OperationRepository operationRepository;

    public AddAnesthesiaDataJpaRepository(AnesthesiaRepository anesthesiaRepository, OperationRepository operationRepository) {
        this.anesthesiaRepository = anesthesiaRepository;
        this.operationRepository = operationRepository;
    }

    @Override
    @Transactional
    public void addAnesthesiaData(long operationId, AnesthesiaData anesthesiaData) throws OperationNotFoundException {
        // find operation to add the anesthesia data to
        OperationDB operationDB = operationRepository.findById(operationId).orElseThrow(() -> new OperationNotFoundException(operationId));

        // build database object
        AnesthesiaDataDB anesthesiaDataDB = AnesthesiaDataDB.builder()
                .depthOfAnesthesia(anesthesiaData.getDepthOfAnesthesia())
                .operation(operationDB)
                .timestamp(anesthesiaData.getTimestamp())
                .build();

        // save entity to database
        anesthesiaRepository.save(anesthesiaDataDB);

        // set flag
        operationDB.setAnesthesiaDataAvailable(true);
    }
}
