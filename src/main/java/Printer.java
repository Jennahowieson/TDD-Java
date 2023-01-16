public class Printer {
    private int paperLeft;
    private int toner;

    public Printer(int paperLeft, int toner) {
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public void setPaperLeft(int paperLeft) {
        this.paperLeft = paperLeft;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void print(int pages, int copies){
        int pagesRequired = (pages * copies);
        if (getPaperLeft() >= pagesRequired){
            setPaperLeft(getPaperLeft()-pagesRequired);
            setToner(getToner()-1);
        }
    }


}