package Homework_6;

public class PDFreport extends Document implements Report{
    public PDFreport(String name, DocType type) {
        super(name, DocType.PDF);
    }

    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
