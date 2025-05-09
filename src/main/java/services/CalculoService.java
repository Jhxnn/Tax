package services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CalculoService {

    @Inject
    AliquotaService aliquotaService;

    @Inject
    ImpostoService impostoService;






}
