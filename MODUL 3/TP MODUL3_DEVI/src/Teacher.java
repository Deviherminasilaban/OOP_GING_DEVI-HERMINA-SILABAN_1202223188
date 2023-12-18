class Teacher extends User {
    public Teacher(String name, int id) {
        super(name, id);
    }

    public void teachClass(String course) {
        System.out.println("\nPak Yoga is Teaching " + course);
    }

    @Override
    public String getUserDetails() {
        return null;
    }
}