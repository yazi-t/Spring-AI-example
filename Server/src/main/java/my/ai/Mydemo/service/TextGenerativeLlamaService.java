package my.ai.Mydemo.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * llama2 based oLlama text generation service.
 */
@Service("generativeLlamaService")
public class TextGenerativeLlamaService implements TextGenerativeService {

    @Autowired
    private OllamaChatModel chatModel;

    /**
     * Generates text response with the oLlama model.
     *
     * @param input input string
     * @return generated output
     */
    public String generate(String input) {
        ChatResponse response = chatModel.call(
                new Prompt(input, OllamaOptions.create().withModel("llama2"))
        );
        return response.getResult().getOutput().getContent();
    }
}
