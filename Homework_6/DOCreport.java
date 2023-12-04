package Homework_6;

public class DOCreport extends Document implements Report{
    public DOCreport(String name, DocType type) {
        super(name, DocType.DOC);
    }

    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
