package config.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig2.class})
public class VideoSystemConfig01 {

}
