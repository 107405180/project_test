package tw.idv.cha102.g7.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleTagListId implements Serializable {

    private Integer schId;

    private Integer schTagId;


}
