package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "uploadSystems",
    path = "uploadSystems"
)
public interface UploadSystemRepository
    extends PagingAndSortingRepository<UploadSystem, Long> {}
