package desion.pattern.principle.relyinvert;

public class Book  implements IReader{
    @Override
    public void content() {
        System.out.println("童话故事书");
    }
}
