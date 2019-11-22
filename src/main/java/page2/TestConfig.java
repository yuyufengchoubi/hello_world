package page2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:yuyufeng.properties")
public class TestConfig {

    @Value("值一")
    public String value1;

    @Value("#{100*2}")
    public Integer value2;

    @Value("${name}")
    public String name;

    @Value("${age}")
    public String age;

    @Value("${sex}")
    public String sex;
}
