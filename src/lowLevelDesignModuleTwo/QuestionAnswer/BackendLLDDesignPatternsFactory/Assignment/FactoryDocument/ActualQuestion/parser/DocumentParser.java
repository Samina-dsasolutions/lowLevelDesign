package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public abstract class DocumentParser {
    private final String path;
    public DocumentParser(String path) {
        this.path = path;
    }
    public abstract void parseDocument();
    public String getPath() {
        return path;
    }
    public abstract DocumentType supportDocument();
}
