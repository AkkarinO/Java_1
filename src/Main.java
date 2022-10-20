public class Main {

    // metoda może nic nie zwracać (void)
    public static void main(String[] args) {

        Contractor seller = new Contractor("Microsoft", "Software", 1);
        System.out.println("Seller id is " + seller.contractorId);

        Contractor buyer = new Contractor("Apple", "Computers", 0);
        System.out.println("Seller id is " + buyer.contractorId);

    }

}
