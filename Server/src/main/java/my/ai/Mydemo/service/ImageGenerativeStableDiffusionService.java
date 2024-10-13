package my.ai.Mydemo.service;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.stabilityai.StabilityAiImageModel;
import org.springframework.ai.stabilityai.api.StabilityAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Stable diffusion API based image generation service.
 */
@Service
public class ImageGenerativeStableDiffusionService implements ImageGenerativeService {

    @Autowired
    private StabilityAiImageModel stabilityAiImageModel;

    /**
     * Generates image response for text prompt.
     *
     * @param prompt text prompt for image generation
     * @return {@link ImageResponse} containing
     * {@link java.util.Base64} encoded image
     */
    @Override
    public ImageResponse generate(String prompt) {
        return stabilityAiImageModel.call(
                new ImagePrompt(prompt,
                        StabilityAiImageOptions.builder()
                                .withStylePreset("cinematic")
                                .withN(4)
                                .withHeight(1024)
                                .withWidth(1024).build())
        );
    }
}
