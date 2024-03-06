package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoStreammed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileId;

    public VideoStreammed(Videoprocess aggregate) {
        super(aggregate);
    }

    public VideoStreammed() {
        super();
    }
}
//>>> DDD / Domain Event
