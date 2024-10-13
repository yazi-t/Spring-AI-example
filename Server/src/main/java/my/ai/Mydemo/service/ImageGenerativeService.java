package my.ai.Mydemo.service;

import org.springframework.ai.image.ImageResponse;

/**
 * The service definition which is responsible for image generation.
 */
public interface ImageGenerativeService {

    /**
     * Generates image response for the given input.
     *
     * @param prompt text prompt for image generation
     * @return {@link ImageResponse} containing
     * {@link java.util.Base64} encoded image
     */
    ImageResponse generate(String prompt);
}
