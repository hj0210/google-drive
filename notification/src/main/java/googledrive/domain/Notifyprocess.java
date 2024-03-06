package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.Notified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notifyprocess_table")
@Data
//<<< DDD / Aggregate Root
public class Notifyprocess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotifyprocessRepository repository() {
        NotifyprocessRepository notifyprocessRepository = NotificationApplication.applicationContext.getBean(
            NotifyprocessRepository.class
        );
        return notifyprocessRepository;
    }

    //<<< Clean Arch / Port Method
    public static void checkUploadedFile(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Notifyprocess notifyprocess = new Notifyprocess();
        repository().save(notifyprocess);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notifyprocess->{
            
            notifyprocess // do something
            repository().save(notifyprocess);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
