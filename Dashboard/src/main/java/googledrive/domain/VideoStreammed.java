package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreammed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileId;
}
