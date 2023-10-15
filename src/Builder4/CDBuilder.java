package Builder4;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType cdType = new CDType();
        cdType.addItems(new Sony());
        return cdType;
    }

    public CDType buildSamsung(){
        CDType cdType = new CDType();
        cdType.addItems(new Samsung());
        return cdType;
    }
}
