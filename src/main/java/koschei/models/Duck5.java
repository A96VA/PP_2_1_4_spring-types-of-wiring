package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    private Egg6 rabbit;

    @Override
    public String toString() {
        return ", в утке яйцо " + rabbit.toString();
    }

}
