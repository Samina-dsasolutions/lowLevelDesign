package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class FLACPlayer extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioPlayer {

    public FLACPlayer(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat.FLAC;
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC player");

    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC player");
    }
}
