package domein;

import java.util.HashMap;
import java.util.Map;

//CREATOR
//TODO
public abstract class Application {

    private final Map<String, Document> documents = new HashMap<>();

    public void addNewDocument(String name) {
        documents.put(name, createDocument());
    }

    public Document getDocument(String name) {
        return documents.get(name);
    }

    public Document removeDocument(String name) {
        return documents.remove(name);
    }
    
    protected abstract Document createDocument();
}
