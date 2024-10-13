package my.ai.Mydemo.controller.dto;

/**
 * Pojo model for incoming message.
 */
public class MessageIn {

    private String message;

    public MessageIn(String message) {
        this.message = message;
    }

    public MessageIn() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
