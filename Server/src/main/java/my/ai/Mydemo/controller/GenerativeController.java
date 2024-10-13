package my.ai.Mydemo.controller;

import my.ai.Mydemo.controller.dto.MessageIn;
import my.ai.Mydemo.controller.dto.MessageOut;
import my.ai.Mydemo.service.TextGenerativeService;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The controller that handles text generative requests.
 */
@RestController
public class GenerativeController {

    /**
     * The injected service implementation.
     */
    @Autowired
    private TextGenerativeService textGenerativeLlamaService;

    /**
     * Simple {@link org.springframework.http.HttpMethod#GET} method API
     * to generate prompt based text responses.
     *
     * @param input the input text
     * @return the generated result
     */
    @GetMapping("generate")
    public String generate(@RequestParam("input") String input) {
        return textGenerativeLlamaService.generate(input);
    }

    /**
     * {@link org.springframework.http.HttpMethod#POST} API to serve web client serving
     * at 4200.
     *
     * @param messageIn message body
     * @return the generated result wrapper
     */
    @PostMapping("chat")
    @CrossOrigin(origins = "http://localhost:4200")
    public MessageOut chat(@RequestBody MessageIn messageIn) {
        String result = this.textGenerativeLlamaService.generate(messageIn.getMessage());
        return new MessageOut(result);
    }

}
