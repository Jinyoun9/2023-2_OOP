abstract class Printer{
    String model;
    int printedCount, availableCount;
    public abstract boolean print();

}
class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print() {
        boolean printable = true;
        if (availableCount >= 1) {
            availableCount--;
            printedCount++;
            printable = true;
        }
        else if(availableCount == 0){
            System.out.printf("%s: %d째 인쇄 실패 - 잉크 부족\n", model, printedCount+1);
            printable = false;
        }
        return printable;
    }
}
class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print() {
        boolean printable = true;
        if (availableCount >= 1) {
            availableCount--;
            printedCount++;
            printable = true;
        }
        else if(availableCount == 0){
            System.out.printf("%s: %d째 인쇄 실패 - 토너 부족\n", model, printedCount+1);
            printable = false;
        }

        return printable;
    }
}
public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
