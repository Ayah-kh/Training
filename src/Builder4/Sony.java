package Builder4;

//implementation of company
public class Sony extends Company{
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
