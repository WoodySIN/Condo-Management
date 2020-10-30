package condoManagement.storage;

import condoManagement.model.ReadOnlyCondoManagement;

import java.util.Optional;

public class StorageManager implements Storage{
    @Override
    public Optional<ReadOnlyCondoManagement> readCondoManagement() {
        return Optional.empty();
    }
}
