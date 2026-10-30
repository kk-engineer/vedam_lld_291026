package com.robosathi.agent.design_patterns.builder;

public class Student {
    private String name;
    private String email;
    private int batch;

    private Student(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.batch = b.batch;
    }

    public String toString() {
        return "Student{name='" + name +"', email='" + email + "', batch=" + batch+"}";
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private int batch;

        // Private constructor
        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder batch(int batch) {
            this.batch = batch;
            return this;
        }
        public Student build() {
            if (name==null) {
                throw new IllegalStateException("name is required");
            }
            if (batch<2029) {
                throw new IllegalStateException("batch must be > 2029");
            }
            return new Student(this);
        }
    }

}


