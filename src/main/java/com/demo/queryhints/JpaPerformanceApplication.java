package com.demo.queryhints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPerformanceApplication
{
//    private final EmployeeRepository repository;
//
//    public JpaPerformanceApplication(EmployeeRepository repository)
//    {
//        this.repository = repository;
//    }
//
//    @PostConstruct
//    public void initDB()
//    {
//
//        List<Employee> employees = IntStream.rangeClosed(3001, 100000)
//                .mapToObj(i -> new Employee("emp" + i, "dept" + i, "employee" + i + "@gmail.com", getGender(),
//                        generateSalary(50000, 100000)))
//                .collect(Collectors.toList());
//
//        repository.saveAll(employees);
//    }
//
//    private String getGender()
//    {
//        return new Random().nextBoolean() ? "Male" : "Female";
//    }
//
//    public static double generateSalary(double min, double max)
//    {
//        // Generate a random double in the range 0.0 to 1.0
//        Random random = new Random();
//        double randomValue = random.nextDouble();
//
//        // Scale it to the range [min, max]
//        return min + (randomValue * (max - min));
//    }

    public static void main(String[] args)
    {
        SpringApplication.run(JpaPerformanceApplication.class, args);
    }
}
