package desion.pattern.principle.relyinvert;

public class Baron {


    private IReader iReader;

    public Baron(IReader iReader) {
        this.iReader = iReader;
    }

    public void action() {
        iReader.content();
    }
}
