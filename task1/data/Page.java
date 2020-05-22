package ua.univer.task1.data;

public class Page extends Photo {
    private int pageId;


    public Page(int id, String data, int pageId) {
        super(id, data);
        this.pageId=pageId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @Override
    public String toString() {
        return "page{" +
                "pageId=" + pageId +
                "} " + super.toString();
    }
}
