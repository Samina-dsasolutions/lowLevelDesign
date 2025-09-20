package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class MP3AudioProcessor extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioProcessor {

    public MP3AudioProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat.MP3;
    }

    @Override
    public byte[] process() {
        return getAudioData();
    }
}
