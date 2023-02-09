import java.util.Scanner;

public class TUI {
    IFunctionality iFunctionality;
    public TUI(IFunctionality iFunctionality){
        this.iFunctionality = iFunctionality;
    }
    public void outputData(String cpr){
        System.out.println(iFunctionality.getName(cpr));
        System.out.println(iFunctionality.getTextualBMI(cpr));
    }
    public String readCPR(){
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while(s.length()!=11){
            s = scanner.nextLine();
        }
        return s;
    }
}
