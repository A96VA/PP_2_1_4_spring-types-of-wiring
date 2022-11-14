package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private final Duck5 rabbit;
    @Autowired
    public Rabbit4(Duck5 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + rabbit.toString();
    }
}
