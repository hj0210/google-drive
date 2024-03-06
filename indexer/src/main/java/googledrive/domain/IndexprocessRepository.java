package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "indexprocesses",
    path = "indexprocesses"
)
public interface IndexprocessRepository
    extends PagingAndSortingRepository<Indexprocess, Long> {}
