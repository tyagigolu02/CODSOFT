import java.util.*;

public class currency {
    public static void print_detail()
    {
        System.out.println("1. INR to DOLLAR \n2. INR to PKR \n3. INR to EURO \n4. INR to BAN Takka \n5. INR to Swiss France \n6. INR to Pound Sterling \n7. INR to Gibraltar Pound");
    }
    public static void main(String[] args) {
        float takeNumber;
        float result;
        System.out.println(" \nWELCOME TO THE CURRENCY CONVEROTR CONCEPT ");
        print_detail();
        System.out.print("Select Any One Of Them :");
        Scanner sc = new Scanner(System.in);
        int takeInput ;
        takeInput = sc.nextInt();
        switch (takeInput) {

            case 1:
            System.out.println("Enter Rupees to Convert INR to DOLLAR");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber * 0.011);
            System.out.printf("%.2f INR is equal to %.2f DOLLAR %n",takeNumber,result);
            break;

            case 2:
            System.out.println("Enter Rupees to Convert INR to PKR");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber * 3.22);
            System.out.printf("%.2f INR is equal to %.2f PKR %n",takeNumber,result);
            break;

            
            case 3:
                System.out.println("Enter Rupees to Convert INR to EURO");
                takeNumber = sc.nextFloat();
                result = (float) (takeNumber * 0.011);
                System.out.printf("%.2f INR is equal to %.2f Euro %n",takeNumber,result);
                break;

            case 4:
            System.out.println("Enter Rupees to Convert INR to BAN Takka");
            takeNumber = sc.nextFloat();
            result = (float) (takeNumber * 1.39);
            System.out.printf("%.2f INR is equal to %.2f BAN Takka %n",takeNumber,result);
            break;

            case 5:
                System.out.println("Enter Rupees to Convert INR to Swiss France");
                takeNumber = sc.nextFloat();
                result = (float) (takeNumber * 0.010);
                System.out.printf("%.2f INR is equal to %.2f Swiss France %n",takeNumber,result);
                break;

            case 6:
                System.out.println("Enter Rupees to Convert INR to Pound Sterling");
                takeNumber = sc.nextFloat();
                result = (float) (takeNumber * 0.0089);
                System.out.printf("%.2f INR is equal to %.2f Pound Sterling %n",takeNumber,result);
                break;

            case 7:
                System.out.println("Enter Rupees to Convert INR to Gibraltar Pound");
                takeNumber = sc.nextFloat();
                result = (float) (takeNumber * 0.00885);
                System.out.printf("%.2f INR is equal to %.2f Gibraltar Pound %n",takeNumber,result);
                break;
        
            default:
            System.out.println("Opps something went wrong May Be You can Entered Invalid Input");
            break;
        }
    }
  }  