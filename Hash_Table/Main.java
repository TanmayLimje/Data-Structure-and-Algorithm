package Hash_table;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("nails",100);
        hashTable.set("tiles",50);
        hashTable.set("lumber",80);

        hashTable.set("bolts",200);
        hashTable.set("screws",100);

        hashTable.printHashTable();

        System.out.println(hashTable.get("lumber"));
        System.out.println(hashTable.get("tanmay"));

        System.out.println(hashTable.keys());
    }
}
