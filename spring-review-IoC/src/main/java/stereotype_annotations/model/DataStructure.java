package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {


    private ExtraHours extraHours;



    public void getTotalHours(){
        System.out.println("Total hours: " + (45 + extraHours.getHours()) );
    }
}
