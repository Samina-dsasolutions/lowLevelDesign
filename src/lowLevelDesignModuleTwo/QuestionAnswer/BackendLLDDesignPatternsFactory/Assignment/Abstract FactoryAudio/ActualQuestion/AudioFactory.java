package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public abstract class AudioFactory {

    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat();
    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioDecoder createDecoder(byte[] audioData);
    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioPlayer createPlayer(int volume, double playbackRate);
    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioProcessor createProcessor(byte[] audioData);
}
