package condoManagement.storage;

import condoManagement.model.ReadOnlyCondoManagement;

import java.util.Optional;

public interface Storage {
    Optional<ReadOnlyCondoManagement> readCondoManagement();
}
