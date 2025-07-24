// Interface defining the contract for all message types
interface Message {
    String getContent();  // Method to get message content
}

// Text message implementation
class TextMessage implements Message {
    private String text;

    public TextMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return "Text: " + text;
    }
}

// Email message implementation
class EmailMessage implements Message {
    private String subject;
    private String body;

    public EmailMessage(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String getContent() {
        return "Email | Subject: " + subject + ", Body: " + body;
    }
}

// Voice message implementation (NEW: Added without modifying existing code)
class VoiceMessage implements Message {
    private String audioClip;

    public VoiceMessage(String audioClip) {
        this.audioClip = audioClip;
    }

    @Override
    public String getContent() {
        return "Voice Message: " + audioClip;
    }
}

// Message processor (can handle ANY Message type without modification)
class MessageProcessor {
    public void process(Message message) {
        System.out.println("Processing: " + message.getContent());
    }
}

// Demo class
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        MessageProcessor processor = new MessageProcessor();

        // Process different message types
        processor.process(new TextMessage("Hello World"));
        processor.process(new EmailMessage("Meeting", "Discuss OCP at 10 AM"));
        processor.process(new VoiceMessage("audio_clip_123.mp3"));
    }
}
