package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser.DocumentParser;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser.SpreadSheetDocumentParser;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.printer.DocumentPrinter;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.printer.SpreadSheetDocumentPrinter;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor.DocumentProcessor;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor.SpreadSheetDocumentProcessor;

public class SpreadSheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadSheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new SpreadSheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new SpreadSheetDocumentProcessor(documentName);
    }
}
