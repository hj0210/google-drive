package googledrive.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long fileId;
    private Long uploader;
    private Float fileSize;
    private Boolean indexed;
    private Boolean uploaded;
    private String videoUrl;
    private Date uploadDt;
}
