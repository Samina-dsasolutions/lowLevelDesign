package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class FLACAudioProcessor extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioProcessor {
    public FLACAudioProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat.FLAC;
    }

    @Override
    public byte[] process() {
        return getAudioData();
    }
}
