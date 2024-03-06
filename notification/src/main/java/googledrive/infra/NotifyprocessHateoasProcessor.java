package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotifyprocessHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Notifyprocess>> {

    @Override
    public EntityModel<Notifyprocess> process(
        EntityModel<Notifyprocess> model
    ) {
        return model;
    }
}
