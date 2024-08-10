 class RecordDev {
    public static void main(String[] args) {
        InnerRecordDev rec1 = new InnerRecordDev("Ram", 1);
        System.out.println(rec1.name());
    }
}


public record InnerRecordDev(String name, Integer rollNumber) {}