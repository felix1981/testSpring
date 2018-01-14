package hello;

public class Hello {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String say(){

        return "Hello "+text;
    }
}
