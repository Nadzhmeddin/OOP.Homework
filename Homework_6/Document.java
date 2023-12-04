package Homework_6;

import java.util.Map;

public class Document {


    private String name;
    protected DocType type;





    public Document(String name, DocType type) {
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", + ";
    }



    public DocType getType() {
        return type;
    }

    protected enum DocType {
        XML,
        JSON,
        PDF,
        DOC,
        OTHER;
    }
}
