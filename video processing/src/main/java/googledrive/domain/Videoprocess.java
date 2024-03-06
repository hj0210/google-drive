package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.VideoStreammed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Videoprocess_table")
@Data
//<<< DDD / Aggregate Root
public class Videoprocess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String videoUrl;

    private Long fileId;

    @PostPersist
    public void onPostPersist() {
        VideoStreammed videoStreammed = new VideoStreammed(this);
        videoStreammed.publishAfterCommit();
    }

    public static VideoprocessRepository repository() {
        VideoprocessRepository videoprocessRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoprocessRepository.class
        );
        return videoprocessRepository;
    }

    //<<< Clean Arch / Port Method
    public static void checkUploadedFileVideo(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Videoprocess videoprocess = new Videoprocess();
        repository().save(videoprocess);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoprocess->{
            
            videoprocess // do something
            repository().save(videoprocess);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
