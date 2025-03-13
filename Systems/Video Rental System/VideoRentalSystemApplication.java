import java.util.*;


class Movie {
    private String title;
    private String inventoryNumber;
    private boolean isRented;

    public Movie(String title, String inventoryNumber) {
        this.title = title;
        this.inventoryNumber = inventoryNumber;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentMovie() {
        isRented = true;
    }

    public void returnMovie() {
        isRented = false;
    }
}

class Customer {
    private String name;
    private String phoneNumber;
    private String membershipNumber;
    private List<Movie> rentedMovies;

    public Customer(String name, String phoneNumber, String membershipNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.membershipNumber = membershipNumber;
        this.rentedMovies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void rentMovie(Movie movie) {
        if (!movie.isRented()) {
            rentedMovies.add(movie);
            movie.rentMovie();
            System.out.println(name + " rented " + movie.getTitle());
        } else {
            System.out.println("Movie is already rented.");
        }
    }

    public void returnMovie(Movie movie) {
        if (rentedMovies.contains(movie)) {
            rentedMovies.remove(movie);
            movie.returnMovie();
            System.out.println(name + " returned " + movie.getTitle());
        }
    }
}

class Employee {
    private String name;
    private double commissionEarned;

    public Employee(String name) {
        this.name = name;
        this.commissionEarned = 0;
    }

    public void sellItem(double amount) {
        commissionEarned += amount * 0.10; // 10% commission
        System.out.println(name + " earned a commission of $" + (amount * 0.10));
    }
}

class VideoRentalSystem {
    private List<Movie> movies;
    private List<Customer> customers;
    private List<Employee> employees;

    public VideoRentalSystem() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Movie findMovie(String inventoryNumber) {
        for (Movie movie : movies) {
            if (movie.getInventoryNumber().equals(inventoryNumber)) {
                return movie;
            }
        }
        return null;
    }

    public Customer findCustomer(String membershipNumber) {
        for (Customer customer : customers) {
            if (customer.getName().equals(membershipNumber)) {
                return customer;
            }
        }
        return null;
    }
}

public class VideoRentalSystemApplication {
    public static void main(String[] args) {
        VideoRentalSystem system = new VideoRentalSystem();

        Movie movie1 = new Movie("Inception", "INV001");
        Movie movie2 = new Movie("Titanic", "INV002");
        system.addMovie(movie1);
        system.addMovie(movie2);

        Customer customer1 = new Customer("Alice", "1234567890", "MEM001");
        system.addCustomer(customer1);

        Employee employee1 = new Employee("Bob");
        system.addEmployee(employee1);

        customer1.rentMovie(movie1);
        customer1.returnMovie(movie1);

        employee1.sellItem(50); // Selling a non-movie item
    }
}
