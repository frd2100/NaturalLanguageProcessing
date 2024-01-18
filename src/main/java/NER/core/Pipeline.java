package NER.core;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class Pipeline {
    private static Properties properties;
    private static StanfordCoreNLP stanfordCoreNlp;
    private static String propertiesName = "tokenize, ssplit, pos, lemma, ner";

    private Pipeline() {
    }

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    @Bean(name = "stanfordCoreNLP")
    public static StanfordCoreNLP getInstance() {
        if (stanfordCoreNlp == null) {
            stanfordCoreNlp = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNlp;
    }

}
