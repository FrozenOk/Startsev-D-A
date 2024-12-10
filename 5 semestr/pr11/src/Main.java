
interface Document extends Cloneable {
    Document clone();
    void setContent(String content);
    String getContent();
}


class TextDocument implements Document {
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        try {
            // Создаем копию
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создаем
        TextDocument originalDocument = new TextDocument("Исходное содержимое документа.");
        System.out.println("Оригинальный документ: " + originalDocument.getContent());

        // Клонируем
        TextDocument clonedDocument = (TextDocument) originalDocument.clone();
        System.out.println("Клонированный документ: " + clonedDocument.getContent());

        // Изменяем
        clonedDocument.setContent("Измененное содержимое клонированного документа.");
        System.out.println("Оригинальный документ после изменения клона: " + originalDocument.getContent());
        System.out.println("Клонированный документ после изменения: " + clonedDocument.getContent());

        // не изменилось
        if (!originalDocument.getContent().equals(clonedDocument.getContent())) {
            System.out.println("Оригинальный документ не затронут изменениями клонированного.");
        }
    }
}
