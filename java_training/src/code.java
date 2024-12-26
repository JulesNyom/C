public class code {
    
    String language;
    String framework;

    code(String language, String framework) {

        this.framework = framework;
        this.language = language;
    }

    void coding () {
        System.out.println("im currently using "+ this.language + " with "+ this.framework + " to code");
    }

}
