package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "transactionRepository{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
