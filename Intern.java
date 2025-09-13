import java.util.Scanner;

public class Intern {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Candidate Details");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Gender: ");
        String gender = sc.next();

        System.out.println("10th percentage: ");
        int pge = sc.nextInt();

        if (pge < 50) {
            throw new InvalidInternException("Registration Failed. Low 10th %");
        }
        else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPge(pge);

            return candidate;
        }
    } 

    public static void main(String[] args) {
        System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successfull");
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}
