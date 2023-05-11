package jobManager.chosen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {
    @Id
    private ObjectId _id;
    private long id;
    private String startTime;
    private String endTime;
    private String queuedTime;
    private String jobStatus;
    private String jobFolderPath;
    private String path;
    private String customer;
    private String name;
    private String owner;
//    private List<Label> labels;
    private Integer duration;


//    public static class Label {
//
//        // Constructors, getters, and setters
//    }


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
