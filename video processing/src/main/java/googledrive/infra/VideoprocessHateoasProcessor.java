package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoprocessHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Videoprocess>> {

    @Override
    public EntityModel<Videoprocess> process(EntityModel<Videoprocess> model) {
        return model;
    }
}
