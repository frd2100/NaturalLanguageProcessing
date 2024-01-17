package fp;

import java.util.Properties;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {

    private static Properties properties;
    private static StanfordCoreNLP stanfordCoreNlp;
    private static String propertiesName = "tokenize, ssplit, pos";

    private Pipeline (){}
    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    public static StanfordCoreNLP getPipeline(){
        if (stanfordCoreNlp == null){
            stanfordCoreNlp = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNlp;
    }

}
