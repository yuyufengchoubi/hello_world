package page1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Service {

    @Autowired
    @Qualifier("doctor1")
    public Person person1;

    @Autowired
    @Qualifier("doctor2")
    public Person person2;

    @Autowired
    @Qualifier("teacher")
    public Person person3;
}
