package Builder4;

//implementation of company
public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
