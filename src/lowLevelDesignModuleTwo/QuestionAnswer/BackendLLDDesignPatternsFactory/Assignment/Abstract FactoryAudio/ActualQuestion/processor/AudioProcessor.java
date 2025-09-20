package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public abstract class AudioProcessor {
    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat();

    public abstract byte[] process();
}
