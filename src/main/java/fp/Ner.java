package fp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Ner {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "i'm Federico and i'm trying to learn Natural processing language, this is the first ner" +
                "try, i live in Boston";
        CoreDocument coreDocument =  new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        
        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for (CoreLabel coreLabel : coreLabelList){
            String ner= coreLabel.get(CoreAnnotations.NormalizedNamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText() + " -- " + ner);
        }

    }
}
