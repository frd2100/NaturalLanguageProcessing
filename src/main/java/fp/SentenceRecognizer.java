package fp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Dear Mr Black,\n" +
                "Please find enclosed my CV in application for the post advertised in the Guardian on 30 November.\n" +
                "The nature of my degree course has prepared me for this position. It involved a great deal of independent research, requiring initiative, self-motivation and a wide range of skills. For one course, [insert course], an understanding of the [insert sector] industry was essential. I found this subject very stimulating.\n" +
                "I am a fast and accurate writer, with a keen eye for detail and I should be very grateful for the opportunity to progress to market reporting. I am able to take on the responsibility of this position immediately, and have the enthusiasm and determination to ensure that I make a success of it.\n" +
                "Thank you for taking the time to consider this application and I look forward to hearing from you in the near future.\n" +
                "Yours sincerely";

        CoreDocument coreDocument =  new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentenceList = coreDocument.sentences();
        for (CoreSentence sentence : coreSentenceList){
            System.out.println(sentence.toString());
        }
    }
}
