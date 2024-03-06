package googledrive.domain;

import googledrive.DriveApplication;
import googledrive.domain.FileUploaded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UploadSystem_table")
@Data
//<<< DDD / Aggregate Root
public class UploadSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    private Long uploader;

    private Float fileSize;

    private Date uploadDt;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static UploadSystemRepository repository() {
        UploadSystemRepository uploadSystemRepository = DriveApplication.applicationContext.getBean(
            UploadSystemRepository.class
        );
        return uploadSystemRepository;
    }
}
//>>> DDD / Aggregate Root
