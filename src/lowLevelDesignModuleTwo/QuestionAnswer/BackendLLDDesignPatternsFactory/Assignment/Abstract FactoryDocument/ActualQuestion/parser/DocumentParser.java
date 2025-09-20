package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public abstract class DocumentParser {
    private final String path;
    public DocumentParser(String path) {
        this.path = path;
    }
    public abstract void parseDocument();
    public String getPath() {
        return path;
    }
    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType supportDocument();
}
