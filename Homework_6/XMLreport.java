package Homework_6;

public class XMLreport extends Document implements Report{
    public XMLreport(String name, DocType type) {
        super(name, DocType.XML);
    }


    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
