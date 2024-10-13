package my.ai.Mydemo.service;

/**
 * The service definition which responsible for text generation.
 */
public interface TextGenerativeService {

    /**
     * Generates text response for the given input.
     *
     * @param input input string
     * @return generated output
     */
    String generate(String input);
}
