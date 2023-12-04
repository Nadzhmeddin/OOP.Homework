package Homework_6;

public class JSONreport extends Document implements Report{
    public JSONreport(String name, DocType type) {
        super(name, DocType.JSON);
    }

    @Override
    public byte[] createReport(Document document) {
        return new byte[0];
    }
}
