package ${package}.${artifactId};

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@Slf4j
@SpringBootApplication
public class Application {

    public static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder.sources(Application.class).bannerMode(Banner.Mode.CONSOLE);
    }

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);
        configureApplication(new SpringApplicationBuilder()).run(args);
        log.info("${artifactId} Application running...");
    }

}
