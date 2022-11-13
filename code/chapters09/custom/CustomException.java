package custom;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;

        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("age must in 18~120");
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
