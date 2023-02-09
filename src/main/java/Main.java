public class Main {
    public static void main(String[] args) {
        IData data = new Data();
        IFunctionality func = new Functionality(data);
        TUI tui = new TUI(func);
        tui.outputData(tui.readCPR());
    }
}
