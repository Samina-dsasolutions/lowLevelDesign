package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser.DocumentParser;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.printer.DocumentPrinter;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportType();

    public abstract DocumentParser createParser(String path);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createProcessor(String documentName);
}
