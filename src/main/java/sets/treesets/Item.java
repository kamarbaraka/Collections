package sets.treesets;

public class Item
        implements Comparable{

    private int itemNumber;
    private String itemDescription;

    public Item(int itemNumber, String itemDescription) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public int compareTo(Object other) {
        int diff = Integer.compare(this.itemNumber, ((Item) other).itemNumber);
        return (diff != 0)? diff: itemDescription.compareTo(((Item) other).itemDescription);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("itemNumber=").append(itemNumber);
        sb.append(", itemDescription='").append(itemDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
