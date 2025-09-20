package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.player;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.MediaFormat;

public class FLACPlayer extends AudioPlayer {

    public FLACPlayer(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
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
