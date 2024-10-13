package my.ai.Mydemo.controller;

import my.ai.Mydemo.service.ImageGenerativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * THe controller that handles image generative requests.
 */
@RestController
@RequestMapping("image")
public class ImageGenerativeController {

    /**
     * The injected service implementation.
     */
    @Autowired
    private ImageGenerativeService imageGenerativeStableDiffusionService;

    /**
     * The API endpoint to generate images based on the given prompt.
     *
     * @param prompt string phrase
     * @return generated image as a {@link java.util.Base64} {@link String}.
     */
    @PostMapping("generate")
    @CrossOrigin(origins = "http://localhost:4200")
    public String generateImage(@RequestBody String prompt) {
        return imageGenerativeStableDiffusionService.generate(prompt).getResult().getOutput().getB64Json();
    }
}
