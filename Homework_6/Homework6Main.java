package Homework_6;



import java.util.*;

public class Homework6Main {

    /**
     * Класс документ - описывает структуру документа.
     *
     * Нужно спроектировать систему отчетов, которая будет формировать отчеты для документа.
     *
     * 1. Формирование PDF-файла (потенциально может быть несколько типов разметки PDF-файла).
     * 2. Формирование JSON-файла с полями документа.
     * 3. Формирование XML-файла с полями документа.
     * 4. ... потенциально могут добавляться разные типы отчетов.
     *
     * После реализации задать себе 2 вопроса и прикрепить их к сданной ДЗ:
     * 1. Насколько сложно добавить поддержку нового типа отчета?
     * 2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
     *
     *
     */

    public static void main(String[] args) {

        new MapReports(Map.of(
                "pdf", new PDFreport("Файл 1", Document.DocType.PDF)
        ));


    }
}