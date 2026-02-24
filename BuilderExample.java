class User {
    private String name;
    private int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Srushti")
                .setAge(21)
                .build();

        System.out.println("User Created");
    }
}