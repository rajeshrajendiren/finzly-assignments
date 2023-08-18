public class Libraryitem {
    private String title;
    private int itemID;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void displayInfo(){
        System.out.println(this.title);
        System.out.println(this.itemID);
    }
}
