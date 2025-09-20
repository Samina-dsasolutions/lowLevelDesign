package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path){
        super(path);
    }
    @Override
    public void parseDocument() {
        // parse document
    }

    @Override
    public DocumentType supportDocument() {
        return DocumentType.TEXT;
    }
}
