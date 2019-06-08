package guru.springframework.springmvcrest.bootstrap;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Steven");
        c1.setLastName("Gerrard");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("James");
        c2.setLastName("Milner");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Robbie");
        c3.setLastName("Fowler");
        customerRepository.save(c3);

        System.out.println("Customers Saved: "+ customerRepository.count());

    }
}
