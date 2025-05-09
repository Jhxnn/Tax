package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import models.Imposto;

@ApplicationScoped
public class ImpostoRepository implements PanacheRepository<Imposto>  {
}
