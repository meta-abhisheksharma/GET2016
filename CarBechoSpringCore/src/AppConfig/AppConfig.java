package AppConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Beans,ConnectionPackage,Controller,DAO,facade_layer,Factory"})
public class AppConfig {

}
