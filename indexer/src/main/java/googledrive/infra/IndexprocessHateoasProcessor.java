package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IndexprocessHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Indexprocess>> {

    @Override
    public EntityModel<Indexprocess> process(EntityModel<Indexprocess> model) {
        return model;
    }
}
