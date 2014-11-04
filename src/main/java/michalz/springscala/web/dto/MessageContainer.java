package michalz.springscala.web.dto;

/**
 * Created by michal on 04.11.14.
 */
public class MessageContainer {
    private String message;

    public MessageContainer() {
    }

    public MessageContainer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
