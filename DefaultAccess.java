package AccessModifiers;

class DefaultExample {
    String message = "This is a default field!"; // Default access

    void displayMessage() { // Default method
        System.out.println("Default Method Called: " + message);
    }
}

class AccessDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Accessing Default Field: " + obj.message);
        obj.displayMessage();
    }
}

