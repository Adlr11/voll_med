package med.voll.api;

import org.flywaydb.core.Flyway;

public class flywayRepair {
    public static void main(String[] args) {
        // Configura la instancia de Flyway con la configuración de tu base de datos
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost:3306/vollmed_api", "root", "toor")
                .load();

        // Ejecuta la reparación de Flyway
        flyway.repair();

    }
}
