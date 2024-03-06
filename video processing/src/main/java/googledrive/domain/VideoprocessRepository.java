package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "videoprocesses",
    path = "videoprocesses"
)
public interface VideoprocessRepository
    extends PagingAndSortingRepository<Videoprocess, Long> {}
