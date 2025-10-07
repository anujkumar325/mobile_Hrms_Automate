import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class configLoader {


    public Properties prop;

    public Properties init_prop() {
        prop = new Properties();
        try {

            FileReader fileread = new FileReader(
                    "/home/anuj/IdeaProjects/mobile_Hrms_Automate/src/test/java/config.properties");
            prop.load(fileread);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return prop;


    }


}
