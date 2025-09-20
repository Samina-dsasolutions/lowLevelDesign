package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.decoder.AudioDecoder;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.player.AudioPlayer;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryAudio.ActualQuestion.processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract  MediaFormat supportsFormat();
    public abstract AudioDecoder createDecoder(byte[] audioData);
    public abstract AudioPlayer createPlayer(int volume, double playbackRate);
    public abstract AudioProcessor createProcessor(byte[] audioData);
}
