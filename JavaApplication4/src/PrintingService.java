public class PrintingService {
    private static PrintingService instance;
    
    private PrintingService() {
     
    }
    
    public static PrintingService getInstance() {
        if (instance == null) {
            instance = new PrintingService();
        }
        return instance;
    }
    
    public void print(String document) {

        System.out.println("Printing: " + document);
    }
    
    public static void main(String[] args) {
       
        PrintingService printingService = PrintingService.getInstance();
        printingService.print("Financial Document from Main App");
        
      
        PrintingService anotherPrintingService = PrintingService.getInstance();
        anotherPrintingService.print("Another Document");
    }
}