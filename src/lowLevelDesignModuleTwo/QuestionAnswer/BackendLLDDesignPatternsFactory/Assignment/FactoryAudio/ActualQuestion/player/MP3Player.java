package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.player;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.MediaFormat;

public class MP3Player extends AudioPlayer{

    public MP3Player(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
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
