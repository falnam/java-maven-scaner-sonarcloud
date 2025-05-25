public class Example {
    // Unused variable - akan terdeteksi sebagai code smell
    private String unusedVariable = "test";
    
    // Method tanpa dokumentasi
    public void methodWithoutJavadoc() {
        // Empty catch block - akan terdeteksi sebagai bug
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // Empty catch - code smell
        }
        
        // Hardcoded password - security vulnerability
        String password = "admin123";
        
        // Duplicate code
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    
    // Method dengan complexity tinggi
    public void complexMethod(int x) {
        if (x > 0) {
            if (x < 10) {
                if (x % 2 == 0) {
                    if (x > 5) {
                        System.out.println("Complex logic");
                    }
                }
            }
        }
    }
}
