package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UploadSystemHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UploadSystem>> {

    @Override
    public EntityModel<UploadSystem> process(EntityModel<UploadSystem> model) {
        return model;
    }
}
