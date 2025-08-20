import java.util.*;

public class NFH9_Prototype_A_Min {
    // Chatbot Analyzer API Specification

    // Define chatbot interaction types
    enum InteractionType {
        TEXT,
        VOICE,
        EMOJI
    }

    // Define chatbot intent categories
    enum IntentCategory {
        GREETING,
        FAREWELL,
        INFORMATION,
        ASSISTANCE
    }

    // Define chatbot response types
    enum ResponseType {
        TEXT,
        IMAGE,
        AUDIO,
        VIDEO
    }

    // Chatbot Interaction class
    class Interaction {
        InteractionType type;
        String input;
        IntentCategory intent;
        ResponseType response;

        Interaction(InteractionType type, String input, IntentCategory intent, ResponseType response) {
            this.type = type;
            this.input = input;
            this.intent = intent;
            this.response = response;
        }
    }

    // Chatbot Analyzer class
    class Analyzer {
        List<Interaction> interactions;

        Analyzer() {
            interactions = new ArrayList<>();
        }

        void analyze(Interaction interaction) {
            interactions.add(interaction);
        }

        // TODO: Implement analysis logic
        void generateReport() {
            // TO DO: Generate report based on interactions
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();

        Interaction interaction1 = new Interaction(InteractionType.TEXT, "Hello", IntentCategory.GREETING, ResponseType.TEXT);
        Interaction interaction2 = new Interaction(InteractionType.VOICE, "What is the weather like today?", IntentCategory.INFORMATION, ResponseType.AUDIO);

        analyzer.analyze(interaction1);
        analyzer.analyze(interaction2);

        analyzer.generateReport();
    }
}