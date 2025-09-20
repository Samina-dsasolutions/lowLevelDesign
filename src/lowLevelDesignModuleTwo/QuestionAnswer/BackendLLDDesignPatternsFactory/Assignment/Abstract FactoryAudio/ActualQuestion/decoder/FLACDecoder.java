package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class FLACDecoder extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioDecoder {

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        return getAudioData();
    }
}
