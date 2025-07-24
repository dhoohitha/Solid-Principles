interface DocumentPrinter {  
    void printDocument();  
}  

interface DocumentScanner {  
    void scanDocument();  
}  

class BasicPrinter implements DocumentPrinter {  
    public void printDocument() {  
        System.out.println("Printing document");  
    }  
}  

class BasicScanner implements DocumentScanner {  
    public void scanDocument() {  
        System.out.println("Scanning document");  
    }  
}  

public class ISPExample {  
    public static void main(String[] args) {  
        DocumentPrinter printer = new BasicPrinter();  
        DocumentScanner scanner = new BasicScanner();  

        printer.printDocument();  
        scanner.scanDocument();  
    }  
}  
