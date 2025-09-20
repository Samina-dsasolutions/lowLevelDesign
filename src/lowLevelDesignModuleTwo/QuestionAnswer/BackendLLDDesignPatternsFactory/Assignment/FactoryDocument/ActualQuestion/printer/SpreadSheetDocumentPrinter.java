package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.printer;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor.DocumentProcessor;

public class SpreadSheetDocumentPrinter extends DocumentPrinter {
    public SpreadSheetDocumentPrinter(DocumentProcessor documentProcessor) {
        super(documentProcessor);
    }
    @Override
    public void printDocument() {
        //print document
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }
}
