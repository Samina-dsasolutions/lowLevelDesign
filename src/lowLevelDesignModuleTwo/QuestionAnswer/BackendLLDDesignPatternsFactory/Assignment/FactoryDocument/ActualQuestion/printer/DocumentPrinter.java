package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.printer;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor.DocumentProcessor;

public abstract class DocumentPrinter {
    private final DocumentProcessor processor;
    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }
    public DocumentProcessor getProcessor() {
        return processor;
    }
    public abstract void printDocument();
    public abstract DocumentType supportType();
}
