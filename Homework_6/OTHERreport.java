package Homework_6;

public class OTHERreport extends Document implements Report{
    public OTHERreport(String name, DocType type) {
        super(name, DocType.OTHER);
    }

    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
