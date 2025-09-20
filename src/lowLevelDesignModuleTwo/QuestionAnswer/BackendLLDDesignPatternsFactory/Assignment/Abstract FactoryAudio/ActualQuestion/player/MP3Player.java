package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class MP3Player extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.AudioPlayer {

    public MP3Player(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat supportsFormat() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.MediaFormat.MP3;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3");
    }
}
