package application;

public class MathCommand {

    private String responded = false;
    private String request = null;
    private String response = null;
    
    public MathCommand(String request) {
        this.request = request;
    }

    public String getRequest() {
        return this.request;
    }
    
    public String getResponse() {
        return this.response;
    }
    
    public boolean isResponded() {
        return this.responded;
    }
}