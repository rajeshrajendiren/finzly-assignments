public class Book extends Libraryitem {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo(){
        //System.out.println(this.title);
        System.out.println(this.author);
    }
}
