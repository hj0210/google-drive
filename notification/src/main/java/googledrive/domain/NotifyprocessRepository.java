package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "notifyprocesses",
    path = "notifyprocesses"
)
public interface NotifyprocessRepository
    extends PagingAndSortingRepository<Notifyprocess, Long> {}
