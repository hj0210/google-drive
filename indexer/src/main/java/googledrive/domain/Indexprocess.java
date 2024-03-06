package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.Indexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Indexprocess_table")
@Data
//<<< DDD / Aggregate Root
public class Indexprocess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    @PostPersist
    public void onPostPersist() {
        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();
    }

    public static IndexprocessRepository repository() {
        IndexprocessRepository indexprocessRepository = IndexerApplication.applicationContext.getBean(
            IndexprocessRepository.class
        );
        return indexprocessRepository;
    }

    //<<< Clean Arch / Port Method
    public static void indexing(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Indexprocess indexprocess = new Indexprocess();
        repository().save(indexprocess);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexprocess->{
            
            indexprocess // do something
            repository().save(indexprocess);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
